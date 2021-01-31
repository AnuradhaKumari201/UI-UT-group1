package com.knoldus.validation


  class EmailValidator {

    def emailIdIsValid(emailId:String):Boolean = {
      var regex = """^([a-zA-Z\d\.-]+)@([a-zA-Z\d-]+)\.(com|net|org)$""";
      return emailId.matches(regex);
    }


}
