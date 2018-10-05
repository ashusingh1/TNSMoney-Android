package com.transcodium.tnsmoney.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
   tableName = "asset_addresses",
   indices = [Index("asset")]

)

data class AssetAddress(
        @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = false) var id: Long? = null,
        @ColumnInfo(name = "asset") var asset: String,
        @ColumnInfo(name = "address") var address: String,
        @ColumnInfo(name = "remote_id") var remote_id: String
)