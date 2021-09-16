package ValidatorTest

import com.validator.Check_Email
import org.scalatest.funsuite.AnyFunSuite

class check_emailTest extends AnyFunSuite {

  val checkEmail = new Check_Email
  test("Check Email when the Email ID has valid recipient name") {

    val expectedResult = true
    val result = checkEmail.checkRecipient("Parth95@gmail.com")
    assert(result == expectedResult)
  }
  test("Check Email when the Email ID has invalid recipient name") {

    val expectedResult = false
    val result = checkEmail.checkRecipient("Parth95##@gmail.com")
    assert(result == expectedResult)
  }

  test("Checking if it returns false on passing an invalid Email Id without '@'"){
    val expectedResult = false
    val result = checkEmail.checkAtTheRate("Parth95#gmail.com")
    assert(result == expectedResult)
  }

  test("Checking if it returns false on passing invalid character on domain"){
    val expectedResult = false
    val result = checkEmail.checkDomainName("Parth95@gma&l.com")
    assert(result == expectedResult)
  }
  test("Checking if it returns invalid emailID with invalid top level domain"){
    val expectedResult = false
    val result = checkEmail.checkTopLevelDomain("Parth95@gmail.com")
  }
}



