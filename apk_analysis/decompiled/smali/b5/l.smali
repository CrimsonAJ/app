.class public final Lb5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J

.field public final synthetic c:Lb5/n;


# direct methods
.method public constructor <init>(Lb5/n;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/l;->c:Lb5/n;

    invoke-static {p2}, LF4/y;->e(Ljava/lang/String;)V

    iput-object p2, p0, Lb5/l;->a:Ljava/lang/String;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lb5/l;->b:J

    return-void
.end method

.method public constructor <init>(Lb5/n;Ljava/lang/String;J)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/l;->c:Lb5/n;

    invoke-static {p2}, LF4/y;->e(Ljava/lang/String;)V

    iput-object p2, p0, Lb5/l;->a:Ljava/lang/String;

    .line 3
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p2

    .line 4
    const-string p3, "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1"

    const-wide/16 v0, -0x1

    invoke-virtual {p1, v0, v1, p3, p2}, Lb5/n;->d1(JLjava/lang/String;[Ljava/lang/String;)J

    move-result-wide p1

    .line 5
    iput-wide p1, p0, Lb5/l;->b:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lb5/l;->c:Lb5/n;

    .line 4
    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-wide v4, v1, Lb5/l;->b:J

    .line 11
    .line 12
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v4, v1, Lb5/l;->a:Ljava/lang/String;

    .line 17
    .line 18
    filled-new-array {v4, v0}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    const-string v8, "app_id = ? and rowid > ?"

    .line 23
    .line 24
    const-string v13, "1000"

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    :try_start_0
    invoke-virtual {v2}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-string v6, "raw_events"

    .line 32
    .line 33
    const-string v15, "rowid"

    .line 34
    .line 35
    const-string v16, "name"

    .line 36
    .line 37
    const-string v17, "timestamp"

    .line 38
    .line 39
    const-string v18, "metadata_fingerprint"

    .line 40
    .line 41
    const-string v19, "data"

    .line 42
    .line 43
    const-string v20, "realtime"

    .line 44
    .line 45
    filled-new-array/range {v15 .. v20}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const-string v12, "rowid"

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v11, 0x0

    .line 53
    invoke-virtual/range {v5 .. v13}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 54
    .line 55
    .line 56
    move-result-object v14

    .line 57
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    :cond_0
    const/4 v0, 0x0

    .line 64
    invoke-interface {v14, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    const/4 v5, 0x3

    .line 69
    invoke-interface {v14, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 70
    .line 71
    .line 72
    move-result-wide v8

    .line 73
    const/4 v5, 0x5

    .line 74
    invoke-interface {v14, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    const-wide/16 v12, 0x1

    .line 79
    .line 80
    cmp-long v5, v10, v12

    .line 81
    .line 82
    const/4 v10, 0x1

    .line 83
    if-nez v5, :cond_1

    .line 84
    .line 85
    move v0, v10

    .line 86
    :cond_1
    const/4 v5, 0x4

    .line 87
    invoke-interface {v14, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iget-wide v11, v1, Lb5/l;->b:J

    .line 92
    .line 93
    cmp-long v11, v6, v11

    .line 94
    .line 95
    if-lez v11, :cond_2

    .line 96
    .line 97
    iput-wide v6, v1, Lb5/l;->b:J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/V0;->r()Lcom/google/android/gms/internal/measurement/U0;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-static {v11, v5}, Lb5/Z;->R0(Lcom/google/android/gms/internal/measurement/a2;[B)Lcom/google/android/gms/internal/measurement/a2;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Lcom/google/android/gms/internal/measurement/U0;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    :try_start_2
    invoke-interface {v14, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    if-nez v10, :cond_3

    .line 114
    .line 115
    const-string v10, ""

    .line 116
    .line 117
    :cond_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    .line 118
    .line 119
    .line 120
    iget-object v11, v5, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 121
    .line 122
    check-cast v11, Lcom/google/android/gms/internal/measurement/V0;

    .line 123
    .line 124
    invoke-static {v11, v10}, Lcom/google/android/gms/internal/measurement/V0;->z(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 v10, 0x2

    .line 128
    invoke-interface {v14, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 129
    .line 130
    .line 131
    move-result-wide v10

    .line 132
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    .line 133
    .line 134
    .line 135
    iget-object v12, v5, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 136
    .line 137
    check-cast v12, Lcom/google/android/gms/internal/measurement/V0;

    .line 138
    .line 139
    invoke-static {v10, v11, v12}, Lcom/google/android/gms/internal/measurement/V0;->C(JLcom/google/android/gms/internal/measurement/V0;)V

    .line 140
    .line 141
    .line 142
    move-object v10, v5

    .line 143
    new-instance v5, Lb5/k;

    .line 144
    .line 145
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    move-object v11, v10

    .line 150
    check-cast v11, Lcom/google/android/gms/internal/measurement/V0;

    .line 151
    .line 152
    move v10, v0

    .line 153
    invoke-direct/range {v5 .. v11}, Lb5/k;-><init>(JJZLcom/google/android/gms/internal/measurement/V0;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    goto :goto_3

    .line 162
    :catch_0
    move-exception v0

    .line 163
    goto :goto_1

    .line 164
    :catch_1
    move-exception v0

    .line 165
    iget-object v5, v2, LD/n;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v5, Lb5/n0;

    .line 168
    .line 169
    iget-object v5, v5, Lb5/n0;->i:Lb5/V;

    .line 170
    .line 171
    invoke-static {v5}, Lb5/n0;->f(Lb5/x0;)V

    .line 172
    .line 173
    .line 174
    iget-object v5, v5, Lb5/V;->f:Lb5/T;

    .line 175
    .line 176
    const-string v6, "Data loss. Failed to merge raw event. appId"

    .line 177
    .line 178
    invoke-static {v4}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {v5, v7, v0, v6}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :goto_0
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_0

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_4
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :goto_1
    :try_start_3
    iget-object v2, v2, LD/n;->a:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v2, Lb5/n0;

    .line 198
    .line 199
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 200
    .line 201
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 202
    .line 203
    .line 204
    iget-object v2, v2, Lb5/V;->f:Lb5/T;

    .line 205
    .line 206
    const-string v5, "Data loss. Error querying raw events batch. appId"

    .line 207
    .line 208
    invoke-static {v4}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-virtual {v2, v4, v0, v5}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 213
    .line 214
    .line 215
    :goto_2
    if-eqz v14, :cond_5

    .line 216
    .line 217
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 218
    .line 219
    .line 220
    :cond_5
    return-object v3

    .line 221
    :goto_3
    if-eqz v14, :cond_6

    .line 222
    .line 223
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 224
    .line 225
    .line 226
    :cond_6
    throw v0
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method
