package edu.mirea.onebeattrue.multitask

class MyThread {
    fun doWork() {
        Thread(Runnable {
            Thread.sleep(15000)
        }).start()
    }
}