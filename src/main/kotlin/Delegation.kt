//interface MyInterface {
//    fun print()
//    val msg: String
//}
//
//class MyImplementation : MyInterface {
//    override fun print() {
//        println(msg)
//    }
//
//    override val msg: String
//        get() = "MyImplementation sends regarsd!"
//}
//
//class MyNewClass(base: MyInterface) : MyInterface by base {
//    override val msg: String
//        get() = "Delegate sends regards!"
//}
//
//fun main() {
//    val delegate = MyImplementation()
//    val delegatingObj = MyNewClass(delegate)
//    println(delegatingObj.msg)
//
//
//    val loggerInstance = BasicLogger()
//    val dateTimeNotifier = ConsoleNotifier(loggerInstance)
//
//    val simpleParser = ExampleParser(dateTimeNotifier, loggerInstance)
//    simpleParser.start()
//}
//
//interface ICallbackReceiver {
//    fun onBeforeAction()
//    fun onAfterAction()
//    fun action(function: () -> Unit) {
//        onBeforeAction()
//        function()
//        onAfterAction()
//    }
//}
//
//interface ILogger {
//    fun getStubDateTime() = "05.11.2024-14:31:04"
//    val format: String
//        get() = "[${getStubDateTime()}]"
//
//    fun print(s: String)
//
//}
//
//// Simple implementation of ILogger interface
//class BasicLogger : ILogger {
//    override fun print(s: String) = println(format + s)
//}
//
//// Implementation of ICallbackReceiver that uses BasicLogger for printing
//class ConsoleNotifier(logger: ILogger) : ICallbackReceiver, ILogger by logger {
//    val onBeforeStr = "OnBefore!"
//    val onAfterStr = "OnAfter!"
//
//    // "print" is delegated to "logger"
//    override fun onBeforeAction() = print(onBeforeStr)
//    override fun onAfterAction() = print(onAfterStr)
//}
//
//
//// Class implementing both interfaces by delegation
//class ExampleParser(notifier: ConsoleNotifier, logger: BasicLogger) :
//    ICallbackReceiver by notifier,
//    ILogger by logger {
//
//    fun start() = action { parseFiles() }
//
//    fun parseFiles() {
//        print("Parsing...")
//        // do some file parsing
//    }
//}