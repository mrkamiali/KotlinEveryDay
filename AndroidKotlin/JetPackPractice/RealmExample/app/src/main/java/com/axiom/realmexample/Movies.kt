package com.axiom.realmexample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movies(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo var title: String,
    @ColumnInfo var desc: String
)
