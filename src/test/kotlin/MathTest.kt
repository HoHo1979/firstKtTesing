import org.junit.Assert
import org.junit.Test

class MathTest {

    @Test
    fun testAdd(){
    //Arrange
        val n1=1
        val n2 =2
        val expected =3
    //act
    val actual:Int = Math().add(n1,n2)

    //Assertion
    Assert.assertEquals(expected,actual)
    }


    @Test
    fun testNoReturn(){

        //Arrange
        val n1=1
        val n2 =2
        val expected =3

        //act
        var m = Math()
        m.addNoReturn(n1,n2)
        var actual = m.result

        //Assertion
        Assert.assertEquals(expected,actual)

    }
}
