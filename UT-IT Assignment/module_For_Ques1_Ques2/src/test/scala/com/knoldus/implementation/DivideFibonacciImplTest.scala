package com.knoldus.implementation

import org.scalatest.flatspec.AnyFlatSpec

class DivideFibonacciImplTest extends AnyFlatSpec {

  "the number " should " be divisible  " in{
    val anu: DivideFibonacciImpl = new DivideFibonacciImpl()
    val laocalValue:Int  = anu.divide(10:Int, 20:Int)
     assert(laocalValue==2)
  }

  "this number " should " be fibonacci " in{
      val anu: DivideFibonacciImpl = new DivideFibonacciImpl()
     val localValue= anu.fibonacci(3)
     assert(localValue .equals ("0 1 1"))
  }
}
