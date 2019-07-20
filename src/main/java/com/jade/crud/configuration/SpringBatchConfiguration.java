/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.configuration;

import com.jade.crud.entity.TblConciliacion01;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;

/**
 *
 * @author mperez
 */
@Configuration
@EnableBatchProcessing
public class SpringBatchConfiguration {
    
    @Bean
    public Job job(JobBuilderFactory jobBuilderFactory
    , StepBuilderFactory stepBuilderFactory
    , ItemReader<TblConciliacion01> itemReader
    , ItemProcessor<TblConciliacion01, TblConciliacion01> itemProcessor
    , ItemWriter<TblConciliacion01> itemWriter){
        
        Step step = stepBuilderFactory.get("ETL-file-load")
                .<TblConciliacion01,TblConciliacion01>chunk(100)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();
        
        return jobBuilderFactory.get("ETL-Load")
                .incrementer(new RunIdIncrementer())
                .start(step)
                .build();
    }
    
    @Bean
    public FlatFileItemReader<TblConciliacion01> itemReader(@Value("${inputFile}") Resource resource) {
        FlatFileItemReader<TblConciliacion01> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setResource(resource);
        flatFileItemReader.setName("CSV-Reader");
        flatFileItemReader.setLinesToSkip(1);
        flatFileItemReader.setLineMapper(lineMapper());
        return flatFileItemReader;
    }
    
    @Bean
    public LineMapper<TblConciliacion01> lineMapper() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultLineMapper<TblConciliacion01> defaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames(new String[]{"cid","ccveref","cnomresidente","cemail","ccveviv","cmonto","ccvestat","canio","cmespa","cvobo"});
        
        BeanWrapperFieldSetMapper<TblConciliacion01> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(TblConciliacion01.class);
        
        defaultLineMapper.setLineTokenizer(lineTokenizer);
        defaultLineMapper.setFieldSetMapper(fieldSetMapper);
        
        return defaultLineMapper;
    }
}
