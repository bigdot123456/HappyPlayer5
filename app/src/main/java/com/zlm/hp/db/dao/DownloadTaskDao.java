package com.zlm.hp.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zlm.down.entity.DownloadTask;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DOWNLOAD_TASK".
*/
public class DownloadTaskDao extends AbstractDao<DownloadTask, Void> {

    public static final String TABLENAME = "DOWNLOAD_TASK";

    /**
     * Properties of entity DownloadTask.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property TaskId = new Property(0, String.class, "taskId", true, "TASK_ID");
        public final static Property TaskName = new Property(1, String.class, "taskName", false, "TASK_NAME");
        public final static Property TaskExt = new Property(2, String.class, "taskExt", false, "TASK_EXT");
        public final static Property TaskPath = new Property(3, String.class, "taskPath", false, "TASK_PATH");
        public final static Property TaskTempPath = new Property(4, String.class, "taskTempPath", false, "TASK_TEMP_PATH");
        public final static Property RootPath = new Property(5, String.class, "rootPath", false, "ROOT_PATH");
        public final static Property TaskUrl = new Property(6, String.class, "taskUrl", false, "TASK_URL");
        public final static Property CreateTime = new Property(7, java.util.Date.class, "createTime", false, "CREATE_TIME");
        public final static Property Status = new Property(8, int.class, "status", false, "STATUS");
        public final static Property ThreadNum = new Property(9, int.class, "threadNum", true, "THREAD_NUM");
        public final static Property TaskFileSize = new Property(10, long.class, "taskFileSize", false, "TASK_FILE_SIZE");
    }


    public DownloadTaskDao(DaoConfig config) {
        super(config);
    }
    
    public DownloadTaskDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DOWNLOAD_TASK\" (" + //
                "\"TASK_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: taskId
                "\"TASK_NAME\" TEXT," + // 1: taskName
                "\"TASK_EXT\" TEXT," + // 2: taskExt
                "\"TASK_PATH\" TEXT," + // 3: taskPath
                "\"TASK_TEMP_PATH\" TEXT," + // 4: taskTempPath
                "\"ROOT_PATH\" TEXT," + // 5: rootPath
                "\"TASK_URL\" TEXT," + // 6: taskUrl
                "\"CREATE_TIME\" INTEGER," + // 7: createTime
                "\"STATUS\" INTEGER NOT NULL ," + // 8: status
                "\"THREAD_NUM\" INTEGER PRIMARY KEY NOT NULL ," + // 9: threadNum
                "\"TASK_FILE_SIZE\" INTEGER NOT NULL );"); // 10: taskFileSize
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DOWNLOAD_TASK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DownloadTask entity) {
        stmt.clearBindings();
 
        String taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindString(1, taskId);
        }
 
        String taskName = entity.getTaskName();
        if (taskName != null) {
            stmt.bindString(2, taskName);
        }
 
        String taskExt = entity.getTaskExt();
        if (taskExt != null) {
            stmt.bindString(3, taskExt);
        }
 
        String taskPath = entity.getTaskPath();
        if (taskPath != null) {
            stmt.bindString(4, taskPath);
        }
 
        String taskTempPath = entity.getTaskTempPath();
        if (taskTempPath != null) {
            stmt.bindString(5, taskTempPath);
        }
 
        String rootPath = entity.getRootPath();
        if (rootPath != null) {
            stmt.bindString(6, rootPath);
        }
 
        String taskUrl = entity.getTaskUrl();
        if (taskUrl != null) {
            stmt.bindString(7, taskUrl);
        }
 
        java.util.Date createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindLong(8, createTime.getTime());
        }
        stmt.bindLong(9, entity.getStatus());
        stmt.bindLong(10, entity.getThreadNum());
        stmt.bindLong(11, entity.getTaskFileSize());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DownloadTask entity) {
        stmt.clearBindings();
 
        String taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindString(1, taskId);
        }
 
        String taskName = entity.getTaskName();
        if (taskName != null) {
            stmt.bindString(2, taskName);
        }
 
        String taskExt = entity.getTaskExt();
        if (taskExt != null) {
            stmt.bindString(3, taskExt);
        }
 
        String taskPath = entity.getTaskPath();
        if (taskPath != null) {
            stmt.bindString(4, taskPath);
        }
 
        String taskTempPath = entity.getTaskTempPath();
        if (taskTempPath != null) {
            stmt.bindString(5, taskTempPath);
        }
 
        String rootPath = entity.getRootPath();
        if (rootPath != null) {
            stmt.bindString(6, rootPath);
        }
 
        String taskUrl = entity.getTaskUrl();
        if (taskUrl != null) {
            stmt.bindString(7, taskUrl);
        }
 
        java.util.Date createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindLong(8, createTime.getTime());
        }
        stmt.bindLong(9, entity.getStatus());
        stmt.bindLong(10, entity.getThreadNum());
        stmt.bindLong(11, entity.getTaskFileSize());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public DownloadTask readEntity(Cursor cursor, int offset) {
        DownloadTask entity = new DownloadTask();
        readEntity(cursor, entity, offset);
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DownloadTask entity, int offset) {
        entity.setTaskId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTaskName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTaskExt(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTaskPath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTaskTempPath(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRootPath(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTaskUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCreateTime(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setStatus(cursor.getInt(offset + 8));
        entity.setThreadNum(cursor.getInt(offset + 9));
        entity.setTaskFileSize(cursor.getLong(offset + 10));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(DownloadTask entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(DownloadTask entity) {
        return null;
    }

    @Override
    public boolean hasKey(DownloadTask entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
