package kr.co.sleeptime.androidseed.fragment

interface ViewBinding<VB : Any> {
    val bindingClass: Class<VB>
    var binding: VB?
    val requireBinding: VB get() = binding!!

    @Suppress("UNCHECKED_CAST")
    fun injectBinding(binding: Any?) {
        this.binding = binding as? VB
    }

    fun clearBinding() {
        this.binding = null
    }
}