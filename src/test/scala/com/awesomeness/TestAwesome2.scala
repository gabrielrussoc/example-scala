package com.awesomeness

import org.scalatest.junit.JUnitSuite
import junit.framework.Assert._
import org.junit.Test

class TestAwesome2 extends JUnitSuite {
 val awesome = new Awesomeness

 @ Test def awesomeExample2 {
   awesome main Array("something")
  }
}
