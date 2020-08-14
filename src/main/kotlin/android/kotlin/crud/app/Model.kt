package android.kotlin.crud.app

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Movie(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val Id: Long, val name: String)
