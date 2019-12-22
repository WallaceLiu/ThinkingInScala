//package com.bdatacap.traits

trait Friend {
  val name: String

  def listen() = println("your friend " + name + " is listening")
}

class Human(val name: String) extends Friend

class Man(override val name: String) extends Human(name)

class Woman(override val name: String) extends Human(name)


class Animal

class Dog(val name: String) extends Animal with Friend {
  override def listen() = println(name + "`s listening")
}


val john = new Man("john")
val sara = new Woman("sara")
val comet = new Dog("comet")

john.listen
sara.listen
comet.listen

val mansBestFriend: Friend = comet
mansBestFriend.listen


def helpAsFriend(friend: Friend) = friend listen

helpAsFriend(sara)
helpAsFriend(comet)

// trait choice
class Cat(val name: String) extends Animal

def useFriend(friend: Friend) = friend listen

val snowy = new Cat("snowy") with Friend
val friend: Friend = snowy
useFriend(snowy)
