package com.zegelin.picocli;

import picocli.CommandLine;

import javax.management.remote.JMXServiceURL;
import java.net.MalformedURLException;

public class JMXServiceURLTypeConverter implements CommandLine.ITypeConverter<JMXServiceURL> {
    @Override
    public JMXServiceURL convert(final String value) {
        try {
            return new JMXServiceURL(value);

        } catch (MalformedURLException e) {
            throw new CommandLine.TypeConversionException("Invalid JMX service URL (" + e.getLocalizedMessage() + ")");
        }
    }
}
