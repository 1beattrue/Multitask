package edu.mirea.onebeattrue.multitask

import android.widget.TextView

class MyThread() {
    fun doWork() {
        Thread(Runnable {
            Thread.sleep(5000)
        }).start()
    }

    fun square(int: Int, view: TextView) {
        Thread(Runnable {
            Thread.sleep(5000)
            view.post( Runnable { // возвращение в ui поток
                view.text = "Результат параллельного потока: ${(int * int)}"
            })
        }).start()
    }
}