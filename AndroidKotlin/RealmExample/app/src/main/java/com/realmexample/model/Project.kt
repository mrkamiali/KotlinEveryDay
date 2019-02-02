package com.realmexample.model

import io.realm.RealmObject
import io.realm.RealmList
import io.realm.annotations.Required
import io.realm.annotations.PrimaryKey
import java.util.*


class Project : RealmObject() {

    @PrimaryKey
    @Required
    var id: String? = null

    @Required
    var owner: String? = null

    @Required
    var name: String? = null

    @Required
    var timestamp: Date? = null

    var items: RealmList<Item>? = null

}