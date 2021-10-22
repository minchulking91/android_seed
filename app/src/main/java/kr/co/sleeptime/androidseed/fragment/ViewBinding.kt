package kr.co.sleeptime.androidseed.fragment

interface ViewBinding<VB : Any> {
    val bindingClass: Class<VB>
    var binding: VB?
    val requireBinding: VB
    fun injectBinding(binding:Any?)
    fun clearBinding()
}