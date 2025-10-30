.class public final Lh1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/a;


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "CommandHandler"

    .line 2
    .line 3
    invoke-static {v0}, Le1/q;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lh1/b;->d:Ljava/lang/String;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh1/b;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lh1/b;->b:Ljava/util/HashMap;

    .line 12
    .line 13
    new-instance p1, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lh1/b;->c:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "ACTION_DELAY_MET"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string p0, "KEY_WORKSPEC_ID"

    .line 14
    .line 15
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "ACTION_SCHEDULE_WORK"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string p0, "KEY_WORKSPEC_ID"

    .line 14
    .line 15
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh1/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lh1/b;->b:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lf1/a;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v1, p1, p2}, Lf1/a;->a(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh1/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lh1/b;->b:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    xor-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final e(Landroid/content/Intent;ILh1/g;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x1

    .line 10
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    const-string v7, "ACTION_CONSTRAINTS_CHANGED"

    .line 15
    .line 16
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/4 v8, 0x0

    .line 21
    if-eqz v7, :cond_7

    .line 22
    .line 23
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v6, "Handling constraints changed %s"

    .line 28
    .line 29
    new-array v7, v5, [Ljava/lang/Object;

    .line 30
    .line 31
    aput-object p1, v7, v8

    .line 32
    .line 33
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    new-array v7, v8, [Ljava/lang/Throwable;

    .line 38
    .line 39
    sget-object v9, Lh1/b;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v3, v9, v6, v7}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Lh1/d;

    .line 45
    .line 46
    iget-object v6, v1, Lh1/b;->a:Landroid/content/Context;

    .line 47
    .line 48
    invoke-direct {v3, v6, v0, v2}, Lh1/d;-><init>(Landroid/content/Context;ILh1/g;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v2, Lh1/g;->e:Lf1/k;

    .line 52
    .line 53
    iget-object v0, v0, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, LG6/e;->h()Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v6, Lh1/c;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    move v7, v8

    .line 70
    move v9, v7

    .line 71
    move v10, v9

    .line 72
    move v11, v10

    .line 73
    move v12, v11

    .line 74
    :cond_0
    if-ge v12, v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    add-int/2addr v12, v5

    .line 81
    check-cast v13, Ln1/j;

    .line 82
    .line 83
    iget-object v13, v13, Ln1/j;->j:Le1/c;

    .line 84
    .line 85
    iget-boolean v14, v13, Le1/c;->d:Z

    .line 86
    .line 87
    or-int/2addr v7, v14

    .line 88
    iget-boolean v14, v13, Le1/c;->b:Z

    .line 89
    .line 90
    or-int/2addr v9, v14

    .line 91
    iget-boolean v14, v13, Le1/c;->e:Z

    .line 92
    .line 93
    or-int/2addr v10, v14

    .line 94
    iget v13, v13, Le1/c;->a:I

    .line 95
    .line 96
    if-eq v13, v5, :cond_1

    .line 97
    .line 98
    move v13, v5

    .line 99
    goto :goto_0

    .line 100
    :cond_1
    move v13, v8

    .line 101
    :goto_0
    or-int/2addr v11, v13

    .line 102
    if-eqz v7, :cond_0

    .line 103
    .line 104
    if-eqz v9, :cond_0

    .line 105
    .line 106
    if-eqz v10, :cond_0

    .line 107
    .line 108
    if-eqz v11, :cond_0

    .line 109
    .line 110
    :cond_2
    sget-object v6, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:Ljava/lang/String;

    .line 111
    .line 112
    new-instance v6, Landroid/content/Intent;

    .line 113
    .line 114
    const-string v12, "androidx.work.impl.background.systemalarm.UpdateProxies"

    .line 115
    .line 116
    invoke-direct {v6, v12}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v12, Landroid/content/ComponentName;

    .line 120
    .line 121
    iget-object v13, v3, Lh1/d;->a:Landroid/content/Context;

    .line 122
    .line 123
    const-class v14, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;

    .line 124
    .line 125
    invoke-direct {v12, v13, v14}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v12}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 129
    .line 130
    .line 131
    const-string v12, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 132
    .line 133
    invoke-virtual {v6, v12, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    const-string v12, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 138
    .line 139
    invoke-virtual {v7, v12, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const-string v9, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 144
    .line 145
    invoke-virtual {v7, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    const-string v9, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 150
    .line 151
    invoke-virtual {v7, v9, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v13, v6}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 155
    .line 156
    .line 157
    iget-object v6, v3, Lh1/d;->c:Lj1/c;

    .line 158
    .line 159
    invoke-virtual {v6, v0}, Lj1/c;->c(Ljava/util/Collection;)V

    .line 160
    .line 161
    .line 162
    new-instance v7, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v9

    .line 175
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    move v12, v8

    .line 180
    :cond_3
    :goto_1
    if-ge v12, v11, :cond_5

    .line 181
    .line 182
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    add-int/2addr v12, v5

    .line 187
    check-cast v14, Ln1/j;

    .line 188
    .line 189
    iget-object v15, v14, Ln1/j;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v14}, Ln1/j;->a()J

    .line 192
    .line 193
    .line 194
    move-result-wide v16

    .line 195
    cmp-long v16, v9, v16

    .line 196
    .line 197
    if-ltz v16, :cond_3

    .line 198
    .line 199
    invoke-virtual {v14}, Ln1/j;->b()Z

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    if-eqz v16, :cond_4

    .line 204
    .line 205
    invoke-virtual {v6, v15}, Lj1/c;->a(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    if-eqz v15, :cond_3

    .line 210
    .line 211
    :cond_4
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_5
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    move v9, v8

    .line 220
    :goto_2
    if-ge v9, v0, :cond_6

    .line 221
    .line 222
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    add-int/2addr v9, v5

    .line 227
    check-cast v10, Ln1/j;

    .line 228
    .line 229
    iget-object v10, v10, Ln1/j;->a:Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {v13, v10}, Lh1/b;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    const-string v14, "Creating a delay_met command for workSpec with id ("

    .line 240
    .line 241
    const-string v15, ")"

    .line 242
    .line 243
    invoke-static {v14, v10, v15}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    new-array v14, v8, [Ljava/lang/Throwable;

    .line 248
    .line 249
    sget-object v15, Lh1/d;->d:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v12, v15, v10, v14}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    new-instance v10, Lcom/google/android/gms/internal/cast/s;

    .line 255
    .line 256
    iget v12, v3, Lh1/d;->b:I

    .line 257
    .line 258
    invoke-direct {v10, v2, v11, v12, v4}, Lcom/google/android/gms/internal/cast/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v10}, Lh1/g;->f(Ljava/lang/Runnable;)V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_6
    invoke-virtual {v6}, Lj1/c;->d()V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :cond_7
    const-string v7, "ACTION_RESCHEDULE"

    .line 270
    .line 271
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    if-eqz v7, :cond_8

    .line 276
    .line 277
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    new-array v3, v3, [Ljava/lang/Object;

    .line 286
    .line 287
    aput-object p1, v3, v8

    .line 288
    .line 289
    aput-object v0, v3, v5

    .line 290
    .line 291
    const-string v0, "Handling reschedule %s, %s"

    .line 292
    .line 293
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    new-array v3, v8, [Ljava/lang/Throwable;

    .line 298
    .line 299
    sget-object v5, Lh1/b;->d:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v4, v5, v0, v3}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    iget-object v0, v2, Lh1/g;->e:Lf1/k;

    .line 305
    .line 306
    invoke-virtual {v0}, Lf1/k;->d0()V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    const-string v9, "KEY_WORKSPEC_ID"

    .line 315
    .line 316
    filled-new-array {v9}, [Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    if-eqz v7, :cond_14

    .line 321
    .line 322
    invoke-virtual {v7}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    if-eqz v10, :cond_9

    .line 327
    .line 328
    goto/16 :goto_7

    .line 329
    .line 330
    :cond_9
    aget-object v9, v9, v8

    .line 331
    .line 332
    invoke-virtual {v7, v9}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    if-nez v7, :cond_a

    .line 337
    .line 338
    goto/16 :goto_7

    .line 339
    .line 340
    :cond_a
    const-string v7, "ACTION_SCHEDULE_WORK"

    .line 341
    .line 342
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    if-eqz v7, :cond_e

    .line 347
    .line 348
    const-string v3, "Opportunistically setting an alarm for "

    .line 349
    .line 350
    const-string v5, "Setting up Alarms for "

    .line 351
    .line 352
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    const-string v7, "KEY_WORKSPEC_ID"

    .line 357
    .line 358
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    const-string v9, "Handling schedule work for "

    .line 367
    .line 368
    invoke-static {v9, v6}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    new-array v10, v8, [Ljava/lang/Throwable;

    .line 373
    .line 374
    sget-object v11, Lh1/b;->d:Ljava/lang/String;

    .line 375
    .line 376
    invoke-virtual {v7, v11, v9, v10}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 377
    .line 378
    .line 379
    iget-object v7, v2, Lh1/g;->e:Lf1/k;

    .line 380
    .line 381
    iget-object v7, v7, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 382
    .line 383
    invoke-virtual {v7}, LG0/E;->c()V

    .line 384
    .line 385
    .line 386
    :try_start_0
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 387
    .line 388
    .line 389
    move-result-object v9

    .line 390
    invoke-virtual {v9, v6}, LG6/e;->l(Ljava/lang/String;)Ln1/j;

    .line 391
    .line 392
    .line 393
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 394
    const-string v10, "Skipping scheduling "

    .line 395
    .line 396
    if-nez v9, :cond_b

    .line 397
    .line 398
    :try_start_1
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    new-instance v2, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string v3, " because it\'s no longer in the DB"

    .line 411
    .line 412
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    new-array v3, v8, [Ljava/lang/Throwable;

    .line 420
    .line 421
    invoke-virtual {v0, v11, v2, v3}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 422
    .line 423
    .line 424
    invoke-virtual {v7}, LG0/E;->m()V

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :catchall_0
    move-exception v0

    .line 429
    goto/16 :goto_4

    .line 430
    .line 431
    :cond_b
    :try_start_2
    iget v12, v9, Ln1/j;->b:I

    .line 432
    .line 433
    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/k1;->c(I)Z

    .line 434
    .line 435
    .line 436
    move-result v12

    .line 437
    if-eqz v12, :cond_c

    .line 438
    .line 439
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    new-instance v2, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    const-string v3, "because it is finished."

    .line 452
    .line 453
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    new-array v3, v8, [Ljava/lang/Throwable;

    .line 461
    .line 462
    invoke-virtual {v0, v11, v2, v3}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 463
    .line 464
    .line 465
    invoke-virtual {v7}, LG0/E;->m()V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_c
    :try_start_3
    invoke-virtual {v9}, Ln1/j;->a()J

    .line 470
    .line 471
    .line 472
    move-result-wide v12

    .line 473
    invoke-virtual {v9}, Ln1/j;->b()Z

    .line 474
    .line 475
    .line 476
    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 477
    const-string v10, " at "

    .line 478
    .line 479
    iget-object v14, v1, Lh1/b;->a:Landroid/content/Context;

    .line 480
    .line 481
    iget-object v15, v2, Lh1/g;->e:Lf1/k;

    .line 482
    .line 483
    if-nez v9, :cond_d

    .line 484
    .line 485
    :try_start_4
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    new-instance v2, Ljava/lang/StringBuilder;

    .line 490
    .line 491
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    new-array v3, v8, [Ljava/lang/Throwable;

    .line 508
    .line 509
    invoke-virtual {v0, v11, v2, v3}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 510
    .line 511
    .line 512
    invoke-static {v14, v15, v6, v12, v13}, Lh1/a;->b(Landroid/content/Context;Lf1/k;Ljava/lang/String;J)V

    .line 513
    .line 514
    .line 515
    goto :goto_3

    .line 516
    :cond_d
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    new-instance v9, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    new-array v8, v8, [Ljava/lang/Throwable;

    .line 539
    .line 540
    invoke-virtual {v5, v11, v3, v8}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    invoke-static {v14, v15, v6, v12, v13}, Lh1/a;->b(Landroid/content/Context;Lf1/k;Ljava/lang/String;J)V

    .line 544
    .line 545
    .line 546
    new-instance v3, Landroid/content/Intent;

    .line 547
    .line 548
    const-class v5, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 549
    .line 550
    invoke-direct {v3, v14, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 551
    .line 552
    .line 553
    const-string v5, "ACTION_CONSTRAINTS_CHANGED"

    .line 554
    .line 555
    invoke-virtual {v3, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 556
    .line 557
    .line 558
    new-instance v5, Lcom/google/android/gms/internal/cast/s;

    .line 559
    .line 560
    invoke-direct {v5, v2, v3, v0, v4}, Lcom/google/android/gms/internal/cast/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2, v5}, Lh1/g;->f(Ljava/lang/Runnable;)V

    .line 564
    .line 565
    .line 566
    :goto_3
    invoke-virtual {v7}, LG0/E;->p()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 567
    .line 568
    .line 569
    invoke-virtual {v7}, LG0/E;->m()V

    .line 570
    .line 571
    .line 572
    return-void

    .line 573
    :goto_4
    invoke-virtual {v7}, LG0/E;->m()V

    .line 574
    .line 575
    .line 576
    throw v0

    .line 577
    :cond_e
    const-string v4, "ACTION_DELAY_MET"

    .line 578
    .line 579
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    if-eqz v4, :cond_10

    .line 584
    .line 585
    const-string v3, "WorkSpec "

    .line 586
    .line 587
    const-string v4, "Handing delay met for "

    .line 588
    .line 589
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 590
    .line 591
    .line 592
    move-result-object v5

    .line 593
    iget-object v7, v1, Lh1/b;->c:Ljava/lang/Object;

    .line 594
    .line 595
    monitor-enter v7

    .line 596
    :try_start_5
    const-string v6, "KEY_WORKSPEC_ID"

    .line 597
    .line 598
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v5

    .line 602
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 603
    .line 604
    .line 605
    move-result-object v6

    .line 606
    sget-object v9, Lh1/b;->d:Ljava/lang/String;

    .line 607
    .line 608
    new-instance v10, Ljava/lang/StringBuilder;

    .line 609
    .line 610
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    new-array v10, v8, [Ljava/lang/Throwable;

    .line 621
    .line 622
    invoke-virtual {v6, v9, v4, v10}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 623
    .line 624
    .line 625
    iget-object v4, v1, Lh1/b;->b:Ljava/util/HashMap;

    .line 626
    .line 627
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    if-nez v4, :cond_f

    .line 632
    .line 633
    new-instance v3, Lh1/e;

    .line 634
    .line 635
    iget-object v4, v1, Lh1/b;->a:Landroid/content/Context;

    .line 636
    .line 637
    invoke-direct {v3, v4, v0, v5, v2}, Lh1/e;-><init>(Landroid/content/Context;ILjava/lang/String;Lh1/g;)V

    .line 638
    .line 639
    .line 640
    iget-object v0, v1, Lh1/b;->b:Ljava/util/HashMap;

    .line 641
    .line 642
    invoke-virtual {v0, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v3}, Lh1/e;->d()V

    .line 646
    .line 647
    .line 648
    goto :goto_5

    .line 649
    :catchall_1
    move-exception v0

    .line 650
    goto :goto_6

    .line 651
    :cond_f
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    new-instance v2, Ljava/lang/StringBuilder;

    .line 656
    .line 657
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    const-string v3, " is already being handled for ACTION_DELAY_MET"

    .line 664
    .line 665
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    new-array v3, v8, [Ljava/lang/Throwable;

    .line 673
    .line 674
    invoke-virtual {v0, v9, v2, v3}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 675
    .line 676
    .line 677
    :goto_5
    monitor-exit v7

    .line 678
    return-void

    .line 679
    :goto_6
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 680
    throw v0

    .line 681
    :cond_10
    const-string v4, "ACTION_STOP_WORK"

    .line 682
    .line 683
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v4

    .line 687
    if-eqz v4, :cond_12

    .line 688
    .line 689
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    const-string v3, "KEY_WORKSPEC_ID"

    .line 694
    .line 695
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 700
    .line 701
    .line 702
    move-result-object v3

    .line 703
    const-string v4, "Handing stopWork work for "

    .line 704
    .line 705
    invoke-static {v4, v0}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v4

    .line 709
    new-array v5, v8, [Ljava/lang/Throwable;

    .line 710
    .line 711
    sget-object v6, Lh1/b;->d:Ljava/lang/String;

    .line 712
    .line 713
    invoke-virtual {v3, v6, v4, v5}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 714
    .line 715
    .line 716
    iget-object v3, v2, Lh1/g;->e:Lf1/k;

    .line 717
    .line 718
    invoke-virtual {v3, v0}, Lf1/k;->f0(Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    sget-object v3, Lh1/a;->a:Ljava/lang/String;

    .line 722
    .line 723
    iget-object v3, v2, Lh1/g;->e:Lf1/k;

    .line 724
    .line 725
    iget-object v3, v3, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 726
    .line 727
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->s()Lb5/G1;

    .line 728
    .line 729
    .line 730
    move-result-object v3

    .line 731
    invoke-virtual {v3, v0}, Lb5/G1;->r(Ljava/lang/String;)Ln1/d;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    if-eqz v4, :cond_11

    .line 736
    .line 737
    iget v4, v4, Ln1/d;->b:I

    .line 738
    .line 739
    iget-object v5, v1, Lh1/b;->a:Landroid/content/Context;

    .line 740
    .line 741
    invoke-static {v4, v5, v0}, Lh1/a;->a(ILandroid/content/Context;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 745
    .line 746
    .line 747
    move-result-object v4

    .line 748
    const-string v5, "Removing SystemIdInfo for workSpecId ("

    .line 749
    .line 750
    const-string v6, ")"

    .line 751
    .line 752
    invoke-static {v5, v0, v6}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    new-array v6, v8, [Ljava/lang/Throwable;

    .line 757
    .line 758
    sget-object v7, Lh1/a;->a:Ljava/lang/String;

    .line 759
    .line 760
    invoke-virtual {v4, v7, v5, v6}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v3, v0}, Lb5/G1;->z(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    :cond_11
    invoke-virtual {v2, v0, v8}, Lh1/g;->a(Ljava/lang/String;Z)V

    .line 767
    .line 768
    .line 769
    return-void

    .line 770
    :cond_12
    const-string v2, "ACTION_EXECUTION_COMPLETED"

    .line 771
    .line 772
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    if-eqz v2, :cond_13

    .line 777
    .line 778
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    const-string v4, "KEY_WORKSPEC_ID"

    .line 783
    .line 784
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v4

    .line 788
    const-string v6, "KEY_NEEDS_RESCHEDULE"

    .line 789
    .line 790
    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 791
    .line 792
    .line 793
    move-result v2

    .line 794
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 795
    .line 796
    .line 797
    move-result-object v6

    .line 798
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    new-array v3, v3, [Ljava/lang/Object;

    .line 803
    .line 804
    aput-object p1, v3, v8

    .line 805
    .line 806
    aput-object v0, v3, v5

    .line 807
    .line 808
    const-string v0, "Handling onExecutionCompleted %s, %s"

    .line 809
    .line 810
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    new-array v3, v8, [Ljava/lang/Throwable;

    .line 815
    .line 816
    sget-object v5, Lh1/b;->d:Ljava/lang/String;

    .line 817
    .line 818
    invoke-virtual {v6, v5, v0, v3}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v1, v4, v2}, Lh1/b;->a(Ljava/lang/String;Z)V

    .line 822
    .line 823
    .line 824
    return-void

    .line 825
    :cond_13
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    sget-object v2, Lh1/b;->d:Ljava/lang/String;

    .line 830
    .line 831
    const-string v3, "Ignoring intent %s"

    .line 832
    .line 833
    new-array v4, v5, [Ljava/lang/Object;

    .line 834
    .line 835
    aput-object p1, v4, v8

    .line 836
    .line 837
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v3

    .line 841
    new-array v4, v8, [Ljava/lang/Throwable;

    .line 842
    .line 843
    invoke-virtual {v0, v2, v3, v4}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 844
    .line 845
    .line 846
    return-void

    .line 847
    :cond_14
    :goto_7
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    sget-object v2, Lh1/b;->d:Ljava/lang/String;

    .line 852
    .line 853
    const-string v3, "Invalid request for "

    .line 854
    .line 855
    const-string v4, ", requires KEY_WORKSPEC_ID."

    .line 856
    .line 857
    invoke-static {v3, v6, v4}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    new-array v4, v8, [Ljava/lang/Throwable;

    .line 862
    .line 863
    invoke-virtual {v0, v2, v3, v4}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 864
    .line 865
    .line 866
    return-void
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method
