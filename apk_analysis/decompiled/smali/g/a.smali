.class public final Lg/a;
.super Lv4/e;
.source "SourceFile"


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg/a;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Li0/y;Ljava/lang/Object;)Lcom/google/firebase/messaging/u;
    .locals 4

    .line 1
    iget v0, p0, Lg/a;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lv4/e;->B(Li0/y;Ljava/lang/Object;)Lcom/google/firebase/messaging/u;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "input"

    .line 14
    .line 15
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, LE/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    new-instance p1, Lcom/google/firebase/messaging/u;

    .line 25
    .line 26
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-direct {p1, p2}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    return-object p1

    .line 34
    :pswitch_1
    check-cast p2, [Ljava/lang/String;

    .line 35
    .line 36
    const-string v0, "input"

    .line 37
    .line 38
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    array-length v0, p2

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    new-instance p1, Lcom/google/firebase/messaging/u;

    .line 45
    .line 46
    sget-object p2, LB7/u;->a:LB7/u;

    .line 47
    .line 48
    invoke-direct {p1, p2}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    array-length v0, p2

    .line 53
    const/4 v1, 0x0

    .line 54
    move v2, v1

    .line 55
    :goto_1
    if-ge v2, v0, :cond_3

    .line 56
    .line 57
    aget-object v3, p2, v2

    .line 58
    .line 59
    invoke-static {p1, v3}, LE/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 p1, 0x0

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    array-length p1, p2

    .line 71
    invoke-static {p1}, LB7/y;->D(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    const/16 v0, 0x10

    .line 76
    .line 77
    if-ge p1, v0, :cond_4

    .line 78
    .line 79
    move p1, v0

    .line 80
    :cond_4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 81
    .line 82
    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 83
    .line 84
    .line 85
    array-length p1, p2

    .line 86
    :goto_2
    if-ge v1, p1, :cond_5

    .line 87
    .line 88
    aget-object v2, p2, v1

    .line 89
    .line 90
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    new-instance p1, Lcom/google/firebase/messaging/u;

    .line 99
    .line 100
    invoke-direct {p1, v0}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :goto_3
    return-object p1

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

.method public final K(Landroid/content/Intent;I)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lg/a;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf/a;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lf/a;-><init>(Landroid/content/Intent;I)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lf/a;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2}, Lf/a;-><init>(Landroid/content/Intent;I)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    if-eqz p1, :cond_3

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    if-eq p2, v0, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    const-string p2, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 p2, 0x0

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    array-length v0, p1

    .line 34
    move v1, p2

    .line 35
    :goto_0
    if-ge v1, v0, :cond_2

    .line 36
    .line 37
    aget v2, p1, v1

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    :goto_3
    return-object p1

    .line 54
    :pswitch_2
    sget-object v0, LB7/u;->a:LB7/u;

    .line 55
    .line 56
    const/4 v1, -0x1

    .line 57
    if-eq p2, v1, :cond_4

    .line 58
    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :cond_4
    if-nez p1, :cond_5

    .line 62
    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_5
    const-string p2, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const-string v1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 72
    .line 73
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_a

    .line 78
    .line 79
    if-nez p2, :cond_6

    .line 80
    .line 81
    goto :goto_7

    .line 82
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 83
    .line 84
    array-length v1, p1

    .line 85
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    array-length v1, p1

    .line 89
    const/4 v2, 0x0

    .line 90
    move v3, v2

    .line 91
    :goto_4
    if-ge v3, v1, :cond_8

    .line 92
    .line 93
    aget v4, p1, v3

    .line 94
    .line 95
    if-nez v4, :cond_7

    .line 96
    .line 97
    const/4 v4, 0x1

    .line 98
    goto :goto_5

    .line 99
    :cond_7
    move v4, v2

    .line 100
    :goto_5
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    invoke-static {p2}, LB7/j;->k0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    new-instance v2, Ljava/util/ArrayList;

    .line 123
    .line 124
    const/16 v3, 0xa

    .line 125
    .line 126
    invoke-static {p1, v3}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    invoke-static {v0, v3}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_9

    .line 146
    .line 147
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_9

    .line 152
    .line 153
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    new-instance v3, LA7/h;

    .line 162
    .line 163
    invoke-direct {v3, p1, v0}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_9
    invoke-static {v2}, LB7/y;->G(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    :cond_a
    :goto_7
    return-object v0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

.method public final h(Li0/y;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 4

    .line 1
    iget p1, p0, Lg/a;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Lf/h;

    .line 7
    .line 8
    new-instance p1, Landroid/content/Intent;

    .line 9
    .line 10
    const-string v0, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p2, Lf/h;->b:Landroid/content/Intent;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v1, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget-object v0, p2, Lf/h;->a:Landroid/content/IntentSender;

    .line 43
    .line 44
    new-instance v1, Lf/h;

    .line 45
    .line 46
    iget v2, p2, Lf/h;->d:I

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    iget p2, p2, Lf/h;->c:I

    .line 50
    .line 51
    invoke-direct {v1, v0, v3, p2, v2}, Lf/h;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 52
    .line 53
    .line 54
    move-object p2, v1

    .line 55
    :cond_0
    const-string v0, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 56
    .line 57
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    const/4 p2, 0x2

    .line 61
    invoke-static {p2}, Li0/M;->H(I)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_1

    .line 66
    .line 67
    new-instance p2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v0, "CreateIntent created the following intent: "

    .line 70
    .line 71
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const-string v0, "FragmentManager"

    .line 82
    .line 83
    invoke-static {v0, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    :cond_1
    return-object p1

    .line 87
    :pswitch_0
    check-cast p2, Landroid/content/Intent;

    .line 88
    .line 89
    const-string p1, "input"

    .line 90
    .line 91
    invoke-static {p2, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object p2

    .line 95
    :pswitch_1
    check-cast p2, Ljava/lang/String;

    .line 96
    .line 97
    const-string p1, "input"

    .line 98
    .line 99
    invoke-static {p2, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    filled-new-array {p2}, [Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance p2, Landroid/content/Intent;

    .line 107
    .line 108
    const-string v0, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 109
    .line 110
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v0, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 114
    .line 115
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    const-string p2, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)"

    .line 120
    .line 121
    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object p1

    .line 125
    :pswitch_2
    check-cast p2, [Ljava/lang/String;

    .line 126
    .line 127
    const-string p1, "input"

    .line 128
    .line 129
    invoke-static {p2, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    new-instance p1, Landroid/content/Intent;

    .line 133
    .line 134
    const-string v0, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 135
    .line 136
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-string v0, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 140
    .line 141
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const-string p2, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)"

    .line 146
    .line 147
    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method
