package edu.mirea.onebeattrue.multitask

class MyThread {
    fun doWork() {
        Thread(object : Runnable {
            override fun run() {
                Thread.sleep(15000)
            }
        }).start()
    }
}