//package com.bdatacap.traits

abstract class Check {
  def check(): String = "Checked Applications Details..."
}

trait CreditCheck extends Check {
  override def check(): String = "Checked Credit..." + super.check()
}

trait EmploymentCheck extends Check {
  override def check(): String = "Checked Employment..." + super.check()
}


trait CriminalRecordCheck extends Check {
  override def check(): String = "Checked Criminal Record..." + super.check()
}

val apartmentCheck = new Check with CreditCheck

println(apartmentCheck check)

val apartmentCheck2 = new Check with CreditCheck with CriminalRecordCheck

println(apartmentCheck2 check)
