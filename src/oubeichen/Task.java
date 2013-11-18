/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oubeichen;

/**
 *
 * @author oubeichen 用于存储任务信息
 */
public class Task implements Cloneable {//独立性，防止复制的时候变成引用复制

    public String UID;//唯一的标识符，用于识别
    public String taskname;
    public int thisindex;
    public String thisstring1;
    public String thisstring2;
    public int thatindex;
    public String thatstring1;
    public String thatstring2;
    public Task(){
        
    }
    public Task(Task tsk){
        Copy(tsk);
    }
    public final void Copy(Task tsk) {
        UID = tsk.UID;
        taskname = tsk.taskname;
        thisindex = tsk.thisindex;
        thisstring1 = tsk.thisstring1;
        thisstring2 = tsk.thisstring2;
        thatindex = tsk.thatindex;
        thatstring1 = tsk.thatstring1;
        thatstring2 = tsk.thatstring2;
    }

    @Override
    public Object clone() {
        try {
            super.clone();
            return super.clone();
        } catch (Exception e) {
            return null;
        }
    }
}
