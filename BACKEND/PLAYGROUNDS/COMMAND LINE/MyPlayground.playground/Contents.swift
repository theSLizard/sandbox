import UIKit

var str = "Hello, playground"

var mynumber:Int = 2
var empty_array=[Int]()

func myfunction() -> Int { mynumber = mynumber * 2; return mynumber }

var result = myfunction()

for _ in 1..<5 {
    result = myfunction()
    empty_array.append(result)
}

let message = "Result = \(mynumber)"

print(message)

