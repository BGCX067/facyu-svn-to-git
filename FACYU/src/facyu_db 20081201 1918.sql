-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.30-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema facyu_db
--

CREATE DATABASE IF NOT EXISTS facyu_db;
USE facyu_db;

--
-- Definition of table `tbl_clientes`
--

DROP TABLE IF EXISTS `tbl_clientes`;
CREATE TABLE `tbl_clientes` (
  `idCliente` int(10) unsigned NOT NULL DEFAULT '0',
  `nombre` varchar(100) DEFAULT NULL,
  `apaterno` varchar(45) DEFAULT NULL,
  `amaterno` varchar(45) DEFAULT NULL,
  `direccion1` varchar(50) DEFAULT NULL,
  `direccion2` varchar(50) DEFAULT NULL,
  `colonia` varchar(45) DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `rfc` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_clientes`
--

/*!40000 ALTER TABLE `tbl_clientes` DISABLE KEYS */;
INSERT INTO `tbl_clientes` (`idCliente`,`nombre`,`apaterno`,`amaterno`,`direccion1`,`direccion2`,`colonia`,`ciudad`,`estado`,`telefono`,`rfc`) VALUES 
 (1,'Carlos','Marquez','Guzman','Isla malta','','conocida','guadalajara','jalisco','1234','mirfc250882'),
 (2,'David','Morales','Ruelas','Por ahi !!!!!! iiiiiiii!!!!!','ke weva','en tu colonia!!! iiiiii!!!','Zapopan','Jalisco','3311392473','MORD820731BL6'),
 (3,'Marco Antonio','Jimenez','Uribe','no lo se','41','por alla iiiiiii','Guadalaara','Jalisco','4141414141','');
/*!40000 ALTER TABLE `tbl_clientes` ENABLE KEYS */;


--
-- Definition of table `tbl_fact_dtl`
--

DROP TABLE IF EXISTS `tbl_fact_dtl`;
CREATE TABLE `tbl_fact_dtl` (
  `idFactura` int(10) unsigned NOT NULL,
  `idProducto` int(10) unsigned NOT NULL,
  `Precio` double(10,2) NOT NULL,
  `Cantidad` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_fact_dtl`
--

/*!40000 ALTER TABLE `tbl_fact_dtl` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_fact_dtl` ENABLE KEYS */;


--
-- Definition of table `tbl_fact_hdr`
--

DROP TABLE IF EXISTS `tbl_fact_hdr`;
CREATE TABLE `tbl_fact_hdr` (
  `idFactura` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `FactNo` varchar(10) NOT NULL,
  `idCliente` int(10) unsigned NOT NULL,
  `FechaFact` datetime NOT NULL,
  `FechaUltimoMovto` datetime NOT NULL,
  `TotalGral` double(10,2) NOT NULL,
  `Estatus` smallint(5) unsigned NOT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_fact_hdr`
--

/*!40000 ALTER TABLE `tbl_fact_hdr` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_fact_hdr` ENABLE KEYS */;


--
-- Definition of table `tbl_productos`
--

DROP TABLE IF EXISTS `tbl_productos`;
CREATE TABLE `tbl_productos` (
  `idProducto` int(10) unsigned NOT NULL DEFAULT '0',
  `nombre` varchar(45) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idProducto`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_productos`
--

/*!40000 ALTER TABLE `tbl_productos` DISABLE KEYS */;
INSERT INTO `tbl_productos` (`idProducto`,`nombre`,`precio`) VALUES 
 (1,'Producto1','10.50'),
 (2,'Producto 2','122.90');
/*!40000 ALTER TABLE `tbl_productos` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
