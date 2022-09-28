package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class testboxttest {



 @BeforeAll
 static void  setup() {
     Configuration.baseUrl = "https://demoqa.com";
     Configuration.browserSize = "1920x1080";
     Configuration.holdBrowserOpen =  true;
 }
    @Test
    void fillFromTest() {
        String name = "Egor";

         open("/text-box");
      // $("[id=userName]").setValue(name);
        $("#userName").setValue(name);
        $("#userEmail").setValue("Egor1@egor.com");
        $("#currentAddress").setValue("some Address 1");
        $("#permanentAddress").setValue("hot address");
        $("#submit").click();

        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text("Egor1@egor.com"));
        $("#output #currentAddress").shouldHave(text("some Address 1"));
        $("#output #permanentAddress").shouldHave(text("hot address"));

    }
}