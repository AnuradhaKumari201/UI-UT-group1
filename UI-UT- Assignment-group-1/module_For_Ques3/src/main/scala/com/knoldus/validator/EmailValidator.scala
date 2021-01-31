package com.knoldus.validator

import java.util.regex.{Matcher, Pattern}

class EmailValidator {

  def emailIdIsValid(emailId:String):Boolean = {
    val regex = """^([a-zA-Z\d\.-]+)@([a-zA-Z\d-]+)\.(com|net|org)$""";
     emailId.matches(regex);
  }
}
