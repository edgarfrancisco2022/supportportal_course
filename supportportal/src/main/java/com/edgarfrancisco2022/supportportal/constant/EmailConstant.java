package com.edgarfrancisco2022.supportportal.constant;

public class EmailConstant {
//    Uses javax.mail dependency
//    public static final String SIMPLE_MAIL_TRANSFER_PROTOCOL = "smtps"; //gmail

    public static final String SIMPLE_MAIL_TRANSFER_PROTOCOL = "smtp"; // outlook
    public static final String USERNAME = "edgarfrancisco@live.com";
    public static final String PASSWORD = "Edgar25550";
    public static final String FROM_EMAIL = "edgarfrancisco@live.com";
    public static final String CC_EMAIL = "";
    public static final String EMAIL_SUBJECT = "Get Arrays, LLC - New Password";
//    public static final String GMAIL_SMTP_SERVER = "smtp.gmail.com"; //gmail
    public static final String OUTLOOK_SMTP_SERVER = "smtp-mail.outlook.com"; //outlook
    public static final String SMTP_HOST = "mail.smtp.host";
    public static final String SMTP_AUTH = "mail.smtp.auth";
    public static final String SMTP_PORT = "mail.smtp.port";
//    public static final int DEFAULT_PORT = 465; //gmail
    public static final int DEFAULT_PORT = 587; //outlook
    public static final String SMTP_STARTTLS_ENABLE = "mail.smtp.starttls.enable";
    public static final String SMTP_STARTTLS_REQUIRED = "mail.smtp.starttls.required";
}
