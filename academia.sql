-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 05-Dez-2022 às 01:01
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `academia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `Nome` varchar(100) DEFAULT NULL,
  `Codigo` varchar(100) NOT NULL,
  `Cpf` varchar(100) NOT NULL,
  `Contato` varchar(100) DEFAULT NULL,
  `Endereco` varchar(100) DEFAULT NULL,
  `Mensalidade` varchar(100) DEFAULT NULL,
  `Data` varchar(100) DEFAULT NULL,
  `Senha` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ca`
--

CREATE TABLE `ca` (
  `Nome` varchar(100) NOT NULL,
  `Data` varchar(100) DEFAULT NULL,
  `Ex1` varchar(100) DEFAULT NULL,
  `Serie` varchar(100) DEFAULT NULL,
  `Ex2` varchar(100) DEFAULT NULL,
  `Serie2` varchar(100) DEFAULT NULL,
  `Ex3` varchar(100) DEFAULT NULL,
  `Serie3` varchar(100) DEFAULT NULL,
  `Ex4` varchar(100) DEFAULT NULL,
  `Serie4` varchar(100) DEFAULT NULL,
  `Ex5` varchar(100) DEFAULT NULL,
  `Serie5` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cb`
--

CREATE TABLE `cb` (
  `Nome` varchar(100) NOT NULL,
  `Data` varchar(100) DEFAULT NULL,
  `Ex1` varchar(100) DEFAULT NULL,
  `Serie` varchar(100) DEFAULT NULL,
  `Ex2` varchar(100) DEFAULT NULL,
  `Serie2` varchar(100) DEFAULT NULL,
  `Ex3` varchar(100) DEFAULT NULL,
  `Serie3` varchar(100) DEFAULT NULL,
  `Ex4` varchar(100) DEFAULT NULL,
  `Serie4` varchar(100) DEFAULT NULL,
  `Ex5` varchar(100) DEFAULT NULL,
  `Serie5` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cc`
--

CREATE TABLE `cc` (
  `Nome` varchar(100) NOT NULL,
  `Data` varchar(100) DEFAULT NULL,
  `Ex1` varchar(100) DEFAULT NULL,
  `Serie` varchar(100) DEFAULT NULL,
  `Ex2` varchar(100) DEFAULT NULL,
  `Serie2` varchar(100) DEFAULT NULL,
  `Ex3` varchar(100) DEFAULT NULL,
  `Serie3` varchar(100) DEFAULT NULL,
  `Ex4` varchar(100) DEFAULT NULL,
  `Serie4` varchar(100) DEFAULT NULL,
  `Ex5` varchar(100) DEFAULT NULL,
  `Serie5` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamento`
--

CREATE TABLE `equipamento` (
  `Equipamento` varchar(100) DEFAULT NULL,
  `Codigo` varchar(100) NOT NULL,
  `Fornecedor` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `equipamento`
--

INSERT INTO `equipamento` (`Equipamento`, `Codigo`, `Fornecedor`) VALUES
('Barra fixa', '1', 'Lucas');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `Nome` varchar(100) DEFAULT NULL,
  `Codigo` varchar(100) NOT NULL,
  `Cpf` varchar(100) NOT NULL,
  `Contato` varchar(100) DEFAULT NULL,
  `Endereco` varchar(100) DEFAULT NULL,
  `Senha` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`Nome`, `Codigo`, `Cpf`, `Contato`, `Endereco`, `Senha`) VALUES
('Jean', '1', '123.456.789-19', '(12)12345-6789', 'Rua dos Palmares,787', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `manutencao`
--

CREATE TABLE `manutencao` (
  `Equipamento` varchar(100) DEFAULT NULL,
  `Data` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

CREATE TABLE `pagamento` (
  `Cpf` varchar(100) DEFAULT NULL,
  `Nome` varchar(100) DEFAULT NULL,
  `Data` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pagamento`
--

INSERT INTO `pagamento` (`Cpf`, `Nome`, `Data`) VALUES
('365.135.151-52', 'Caio', '2022-11-17'),
('365.135.151-52', 'Bruna', '2022-12-02'),
('987.654.265-98', 'Gustavo', '2022-12-20'),
('987.654.265-98', 'Gustavo', '2022-12-20'),
('987.654.265-98', 'Gustavo', '2022-12-20'),
('457.389.778-07', 'João', '2022-12-20'),
('457.389.778-07', 'João', '2022-12-20'),
('457.389.778-07', 'João', '2022-12-20'),
('489.652.132-55', 'Bruna', '2022-12-20'),
('489.652.132-55', 'Bruna', '2022-12-20'),
('489.652.132-55', 'Bruna', '2022-12-20'),
('457.389.778-07', 'Lucas', '2022-12-20'),
('457.389.778-07', 'Lucas', '2022-12-20'),
('457.389.778-07', 'Lucas', '2022-12-20'),
('457.389.778-07', 'João', '2022-12-20'),
('457.389.778-07', 'João', '2022-12-20'),
('457.389.778-07', 'João', '2022-12-20'),
('457.389.778-07', 'João', '2022-12-30'),
('457.389.778-07', 'João', '2022-12-30'),
('457.389.778-07', 'João', '2022-12-30');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`Codigo`),
  ADD UNIQUE KEY `Cpf` (`Cpf`);

--
-- Índices para tabela `equipamento`
--
ALTER TABLE `equipamento`
  ADD PRIMARY KEY (`Codigo`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`Codigo`),
  ADD UNIQUE KEY `Cpf` (`Cpf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
