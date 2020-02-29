package com;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws InvalidConfigurationException, InterruptedException, SQLException, IOException, XMLParserException {

        File file = new File("C:\\Users\\pro\\IdeaProjects\\test\\src\\com\\generatorConfig.xml");
        List<String> warnings = new ArrayList<>();

        ConfigurationParser configurationParser = new ConfigurationParser(warnings);

        Configuration configuration = configurationParser.parseConfiguration(file);

        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(true);

        MyBatisGenerator generator = new MyBatisGenerator(configuration,defaultShellCallback,warnings);
        generator.generate(null);
    }
}
