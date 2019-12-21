// src/main/scala/progscala2/typesystem/higherkinded/add-seq.sc
import com.bdatacap.typesystem.higherkinded.Add              // <1>
import com.bdatacap.typesystem.higherkinded.Add._

def sumSeq[T : Add](seq: Seq[T]): T =                      // <2>
  seq reduce (implicitly[Add[T]].add(_,_))

sumSeq(Vector(1 -> 10, 2 -> 20, 3 -> 30))                  // Result: (6,60)
sumSeq(1 to 10)                                            // Result: 55
sumSeq(Option(2))                                          // <3> Error! 
