package com.tw.energy.domain

import java.time.Instant

case class ElectricityReading(time: Instant, reading: BigDecimal)
