package com.example.a7minuteworkout

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.a7minuteworkout.HistoryEntity
import kotlinx.coroutines.flow.Flow

//Todo 4 create a dao interface with insert method
@Dao
interface HistoryDao {

    @Insert
    suspend fun insert(historyEntity: HistoryEntity)

    @Query("Select * from `history-table`")
    fun fetchALlDates(): Flow<List<HistoryEntity>>
}