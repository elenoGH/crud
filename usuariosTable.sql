USE [DBJADETEST]
GO
/****** Object:  Table [dbo].[usuarios]    Script Date: 12/07/2019 05:54:38 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[usuarios](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](900) NULL,
	[secondname] [nvarchar](900) NULL,
	[appat] [nvarchar](900) NULL,
	[apmat] [nvarchar](900) NULL,
	[edad] [int] NULL,
	[bancocuenta] [nvarchar](900) NULL,
	[bancosucursal] [nvarchar](900) NULL,
	[bancoclave] [nvarchar](900) NULL,
	[bancoreferencia] [nvarchar](900) NULL,
	[folio] [nvarchar](900) NULL,
	[casa] [nvarchar](900) NULL,
	[manzana] [nvarchar](900) NULL,
	[propietario] [nvarchar](900) NULL,
	[privada] [nvarchar](900) NULL,
	[email] [nvarchar](400) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
