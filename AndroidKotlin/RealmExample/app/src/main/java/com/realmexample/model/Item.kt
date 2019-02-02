package com.realmexample.model

import io.realm.RealmObject
import io.realm.annotations.Required
import io.realm.annotations.PrimaryKey
import java.util.*


class Item : RealmObject() {
    @PrimaryKey
    @Required
    var itemId: String? = null
    @Required
    var body: String? = null
    @Required
    var isDone: Boolean? = null
    @Required
    var timestamp: Date? = null
}