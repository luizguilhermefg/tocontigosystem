/*
Script to Build DATABASE ToContigo System
powered by : "G"
........................................
........................................
............     Loading        ........
........................................
........................................

Script Start!
Criando Database

*/
CREATE DATABASE ToContigo;
USE ToContigo;
/*
Init Create Tables......................
Criação das tabelas para o sistema ToContigo
*/
CREATE TABLE IF NOT EXISTS `Cliente` (
  `id_cliente` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) DEFAULT NULL,
  `cpf` char(14) NULL,
  `cnpj` char(18) NULL,
  `rg` char(8) NOT NULL,
  `rua` varchar(200) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `telefone_comercial` varchar(50) DEFAULT NULL,
  `celular` varchar(50) DEFAULT NULL,
  `estado` varchar(200) DEFAULT NULL,
  `pais` varchar(250) DEFAULT NULL,
  `bairro` varchar(200) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `numero` varchar(4) DEFAULT NULL,
  `data_nascimento`  varchar(15) NOT NULL,
  `limite` double NOT NULL DEFAULT 0.0,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS `Funcionario` (
  `id_funcionario` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) DEFAULT NULL,
  `cpf` char(14) NOT NULL,
  `rg` char(8) NOT NULL,
  `data_nascimento`  varchar(15) NOT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `login` varchar(50) NOT NULL,
  `senha`varchar(64) NOT NULL,
  `funcao` varchar(100) NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  UNIQUE KEY `login` (`login`)
 ) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;
 
 CREATE TABLE IF NOT EXISTS `Produto` (
  `id_produto` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) DEFAULT NULL,
  `marca` varchar(200) NOT NULL,
  `grupo` varchar(200) NOT NULL,
  `unidade` int DEFAULT NULL,
  `kilo` double DEFAULT NULL,
  `quantidade` int NOT NULL,
  PRIMARY KEY (`id_produto`)
 ) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;
   
 CREATE TABLE IF NOT EXISTS `Venda` (
  `id_venda` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_cliente` bigint(20) unsigned NOT NULL,
  `id_produto` bigint(20) unsigned NOT NULL,
  `id_vendedor` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id_venda`)
 ) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;
 
 CREATE TABLE IF NOT EXISTS `Historico` (
  `id_historico` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_vendedor` bigint(20) unsigned NOT NULL,
  `id_venda` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id_historico`)
 ) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;
 
 /*******************************************************
 ***************** End Create Tables ********************
 ********************************************************
 ********************************************************/
 -- Init Create Constraints and Foreign Keys
 -- Chaves estrangeiras tabela Venda
 
ALTER TABLE `Venda` ADD CONSTRAINT `fk_cliente` FOREIGN KEY ( `id_cliente` ) REFERENCES `Cliente` ( `id_cliente` ) ;
ALTER TABLE `Venda` ADD CONSTRAINT `fk_produto` FOREIGN KEY ( `id_produto` ) REFERENCES `Produto` ( `id_produto` ) ;
ALTER TABLE `Venda` ADD CONSTRAINT `fk_vendedor` FOREIGN KEY ( `id_vendedor` ) REFERENCES `Funcionario` ( `id_funcionario` ) ;

-- Chaves estrangeiras tabela Historico

 ALTER TABLE `Historico` ADD CONSTRAINT `fk_vendedor_historico` FOREIGN KEY ( `id_vendedor` ) REFERENCES `Funcionario` ( `id_funcionario` ) ;
ALTER TABLE `Historico` ADD CONSTRAINT `fk_venda_historico` FOREIGN KEY ( `id_venda` ) REFERENCES `Venda` ( `id_venda` ) ;
 
