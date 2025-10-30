.class public final Lo1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final c:Ljava/lang/String;


# instance fields
.field public final a:Lf1/e;

.field public final b:LO0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Le1/q;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lo1/d;->c:Ljava/lang/String;

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

.method public constructor <init>(Lf1/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo1/d;->a:Lf1/e;

    .line 5
    .line 6
    new-instance p1, LO0/c;

    .line 7
    .line 8
    const/16 v0, 0x18

    .line 9
    .line 10
    invoke-direct {p1, v0}, LO0/c;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lo1/d;->b:LO0/c;

    .line 14
    .line 15
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static a(Lf1/e;)Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lf1/e;->g0(Lf1/e;)Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    new-array v3, v2, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, [Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-object v5, v0, Lf1/e;->m:Lf1/k;

    .line 24
    .line 25
    iget-object v6, v5, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    array-length v8, v1

    .line 30
    if-lez v8, :cond_0

    .line 31
    .line 32
    const/4 v8, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v8, v2

    .line 35
    :goto_0
    const/4 v9, 0x4

    .line 36
    const/4 v10, 0x3

    .line 37
    if-eqz v8, :cond_5

    .line 38
    .line 39
    array-length v12, v1

    .line 40
    move v13, v2

    .line 41
    move v15, v13

    .line 42
    move/from16 v16, v15

    .line 43
    .line 44
    const/4 v14, 0x1

    .line 45
    :goto_1
    if-ge v13, v12, :cond_6

    .line 46
    .line 47
    aget-object v7, v1, v13

    .line 48
    .line 49
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    invoke-virtual {v11, v7}, LG6/e;->l(Ljava/lang/String;)Ln1/j;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    if-nez v11, :cond_1

    .line 58
    .line 59
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v3, "Prerequisite "

    .line 64
    .line 65
    const-string v4, " doesn\'t exist; not enqueuing"

    .line 66
    .line 67
    invoke-static {v3, v7, v4}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    new-array v4, v2, [Ljava/lang/Throwable;

    .line 72
    .line 73
    sget-object v5, Lo1/d;->c:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v1, v5, v3, v4}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    const/4 v4, 0x1

    .line 79
    goto/16 :goto_18

    .line 80
    .line 81
    :cond_1
    iget v7, v11, Ln1/j;->b:I

    .line 82
    .line 83
    if-ne v7, v10, :cond_2

    .line 84
    .line 85
    const/4 v11, 0x1

    .line 86
    goto :goto_3

    .line 87
    :cond_2
    move v11, v2

    .line 88
    :goto_3
    and-int/2addr v14, v11

    .line 89
    if-ne v7, v9, :cond_3

    .line 90
    .line 91
    const/16 v16, 0x1

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_3
    const/4 v11, 0x6

    .line 95
    if-ne v7, v11, :cond_4

    .line 96
    .line 97
    const/4 v15, 0x1

    .line 98
    :cond_4
    :goto_4
    add-int/lit8 v13, v13, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    move v15, v2

    .line 102
    move/from16 v16, v15

    .line 103
    .line 104
    const/4 v14, 0x1

    .line 105
    :cond_6
    iget-object v7, v0, Lf1/e;->n:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    if-nez v11, :cond_18

    .line 112
    .line 113
    if-nez v8, :cond_18

    .line 114
    .line 115
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    invoke-virtual {v12, v7}, LG6/e;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    if-nez v13, :cond_18

    .line 128
    .line 129
    iget v13, v0, Lf1/e;->o:I

    .line 130
    .line 131
    if-eq v13, v10, :cond_7

    .line 132
    .line 133
    if-ne v13, v9, :cond_8

    .line 134
    .line 135
    :cond_7
    move-object/from16 v17, v6

    .line 136
    .line 137
    goto :goto_8

    .line 138
    :cond_8
    const/4 v10, 0x2

    .line 139
    if-ne v13, v10, :cond_b

    .line 140
    .line 141
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    move v9, v2

    .line 146
    :goto_5
    if-ge v9, v13, :cond_b

    .line 147
    .line 148
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v17

    .line 152
    add-int/lit8 v9, v9, 0x1

    .line 153
    .line 154
    move-object/from16 v2, v17

    .line 155
    .line 156
    check-cast v2, Ln1/h;

    .line 157
    .line 158
    iget v2, v2, Ln1/h;->b:I

    .line 159
    .line 160
    move-object/from16 v17, v6

    .line 161
    .line 162
    const/4 v6, 0x1

    .line 163
    if-eq v2, v6, :cond_a

    .line 164
    .line 165
    if-ne v2, v10, :cond_9

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_9
    move-object/from16 v6, v17

    .line 169
    .line 170
    const/4 v2, 0x0

    .line 171
    goto :goto_5

    .line 172
    :cond_a
    :goto_6
    const/4 v2, 0x0

    .line 173
    goto :goto_2

    .line 174
    :cond_b
    move-object/from16 v17, v6

    .line 175
    .line 176
    new-instance v2, Lo1/b;

    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    invoke-direct {v2, v5, v7, v6}, Lo1/b;-><init>(Lf1/k;Ljava/lang/String;Z)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Lo1/c;->run()V

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    const/4 v6, 0x0

    .line 194
    :goto_7
    if-ge v6, v5, :cond_c

    .line 195
    .line 196
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    add-int/lit8 v6, v6, 0x1

    .line 201
    .line 202
    check-cast v9, Ln1/h;

    .line 203
    .line 204
    iget-object v9, v9, Ln1/h;->a:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v2, v9}, LG6/e;->c(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    goto :goto_7

    .line 210
    :cond_c
    const/4 v2, 0x1

    .line 211
    const/4 v10, 0x0

    .line 212
    goto/16 :goto_11

    .line 213
    .line 214
    :goto_8
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->q()Lk4/E;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    new-instance v5, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    const/4 v8, 0x0

    .line 228
    :goto_9
    if-ge v8, v6, :cond_13

    .line 229
    .line 230
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    add-int/lit8 v8, v8, 0x1

    .line 235
    .line 236
    check-cast v9, Ln1/h;

    .line 237
    .line 238
    iget-object v10, v9, Ln1/h;->a:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move/from16 v20, v6

    .line 244
    .line 245
    const-string v6, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"

    .line 246
    .line 247
    move/from16 v21, v8

    .line 248
    .line 249
    const/4 v8, 0x1

    .line 250
    invoke-static {v8, v6}, LG0/G;->a(ILjava/lang/String;)LG0/G;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    if-nez v10, :cond_d

    .line 255
    .line 256
    invoke-virtual {v6, v8}, LG0/G;->t(I)V

    .line 257
    .line 258
    .line 259
    goto :goto_a

    .line 260
    :cond_d
    invoke-virtual {v6, v8, v10}, LG0/G;->m(ILjava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :goto_a
    iget-object v8, v2, Lk4/E;->b:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v8, Landroidx/work/impl/WorkDatabase_Impl;

    .line 266
    .line 267
    invoke-virtual {v8}, LG0/E;->b()V

    .line 268
    .line 269
    .line 270
    const/4 v10, 0x0

    .line 271
    invoke-static {v8, v6, v10}, Ls8/n;->w(LG0/E;LG0/G;Z)Landroid/database/Cursor;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    :try_start_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 276
    .line 277
    .line 278
    move-result v18

    .line 279
    if-eqz v18, :cond_e

    .line 280
    .line 281
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 282
    .line 283
    .line 284
    move-result v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 285
    if-eqz v18, :cond_e

    .line 286
    .line 287
    const/16 v18, 0x1

    .line 288
    .line 289
    goto :goto_b

    .line 290
    :catchall_0
    move-exception v0

    .line 291
    goto :goto_e

    .line 292
    :cond_e
    move/from16 v18, v10

    .line 293
    .line 294
    :goto_b
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6}, LG0/G;->g()V

    .line 298
    .line 299
    .line 300
    if-nez v18, :cond_12

    .line 301
    .line 302
    iget v6, v9, Ln1/h;->b:I

    .line 303
    .line 304
    const/4 v8, 0x3

    .line 305
    if-ne v6, v8, :cond_f

    .line 306
    .line 307
    const/16 v18, 0x1

    .line 308
    .line 309
    goto :goto_c

    .line 310
    :cond_f
    move/from16 v18, v10

    .line 311
    .line 312
    :goto_c
    and-int v14, v14, v18

    .line 313
    .line 314
    const/4 v8, 0x4

    .line 315
    if-ne v6, v8, :cond_10

    .line 316
    .line 317
    const/16 v16, 0x1

    .line 318
    .line 319
    goto :goto_d

    .line 320
    :cond_10
    const/4 v8, 0x6

    .line 321
    if-ne v6, v8, :cond_11

    .line 322
    .line 323
    const/4 v15, 0x1

    .line 324
    :cond_11
    :goto_d
    iget-object v6, v9, Ln1/h;->a:Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    :cond_12
    move/from16 v6, v20

    .line 330
    .line 331
    move/from16 v8, v21

    .line 332
    .line 333
    const/4 v10, 0x3

    .line 334
    goto :goto_9

    .line 335
    :goto_e
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6}, LG0/G;->g()V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :cond_13
    const/4 v8, 0x4

    .line 343
    const/4 v10, 0x0

    .line 344
    if-ne v13, v8, :cond_16

    .line 345
    .line 346
    if-nez v15, :cond_14

    .line 347
    .line 348
    if-eqz v16, :cond_16

    .line 349
    .line 350
    :cond_14
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-virtual {v2, v7}, LG6/e;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    move v8, v10

    .line 363
    :goto_f
    if-ge v8, v6, :cond_15

    .line 364
    .line 365
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    add-int/lit8 v8, v8, 0x1

    .line 370
    .line 371
    check-cast v9, Ln1/h;

    .line 372
    .line 373
    iget-object v9, v9, Ln1/h;->a:Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v2, v9}, LG6/e;->c(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    goto :goto_f

    .line 379
    :cond_15
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 380
    .line 381
    move v15, v10

    .line 382
    move/from16 v16, v15

    .line 383
    .line 384
    :cond_16
    invoke-interface {v5, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    check-cast v1, [Ljava/lang/String;

    .line 389
    .line 390
    array-length v2, v1

    .line 391
    if-lez v2, :cond_17

    .line 392
    .line 393
    const/4 v8, 0x1

    .line 394
    goto :goto_10

    .line 395
    :cond_17
    move v8, v10

    .line 396
    :goto_10
    move v2, v10

    .line 397
    goto :goto_11

    .line 398
    :cond_18
    move v10, v2

    .line 399
    move-object/from16 v17, v6

    .line 400
    .line 401
    goto :goto_10

    .line 402
    :goto_11
    iget-object v5, v0, Lf1/e;->p:Ljava/util/List;

    .line 403
    .line 404
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    move v6, v2

    .line 409
    :goto_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    if-eqz v2, :cond_24

    .line 414
    .line 415
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    check-cast v2, Le1/s;

    .line 420
    .line 421
    iget-object v9, v2, Le1/s;->b:Ln1/j;

    .line 422
    .line 423
    if-eqz v8, :cond_1b

    .line 424
    .line 425
    if-nez v14, :cond_1b

    .line 426
    .line 427
    if-eqz v16, :cond_19

    .line 428
    .line 429
    const/4 v12, 0x4

    .line 430
    iput v12, v9, Ln1/j;->b:I

    .line 431
    .line 432
    goto :goto_13

    .line 433
    :cond_19
    const/4 v12, 0x4

    .line 434
    if-eqz v15, :cond_1a

    .line 435
    .line 436
    const/4 v13, 0x6

    .line 437
    iput v13, v9, Ln1/j;->b:I

    .line 438
    .line 439
    goto :goto_13

    .line 440
    :cond_1a
    const/4 v13, 0x6

    .line 441
    const/4 v10, 0x5

    .line 442
    iput v10, v9, Ln1/j;->b:I

    .line 443
    .line 444
    goto :goto_13

    .line 445
    :cond_1b
    const/4 v12, 0x4

    .line 446
    const/4 v13, 0x6

    .line 447
    invoke-virtual {v9}, Ln1/j;->c()Z

    .line 448
    .line 449
    .line 450
    move-result v10

    .line 451
    if-nez v10, :cond_1c

    .line 452
    .line 453
    iput-wide v3, v9, Ln1/j;->n:J

    .line 454
    .line 455
    goto :goto_13

    .line 456
    :cond_1c
    const-wide/16 v12, 0x0

    .line 457
    .line 458
    iput-wide v12, v9, Ln1/j;->n:J

    .line 459
    .line 460
    :goto_13
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 461
    .line 462
    const/16 v12, 0x19

    .line 463
    .line 464
    if-gt v10, v12, :cond_1e

    .line 465
    .line 466
    iget-object v10, v9, Ln1/j;->j:Le1/c;

    .line 467
    .line 468
    iget-object v12, v9, Ln1/j;->c:Ljava/lang/String;

    .line 469
    .line 470
    const-class v13, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 471
    .line 472
    move-wide/from16 v19, v3

    .line 473
    .line 474
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    if-nez v3, :cond_1f

    .line 483
    .line 484
    iget-boolean v3, v10, Le1/c;->d:Z

    .line 485
    .line 486
    if-nez v3, :cond_1d

    .line 487
    .line 488
    iget-boolean v3, v10, Le1/c;->e:Z

    .line 489
    .line 490
    if-eqz v3, :cond_1f

    .line 491
    .line 492
    :cond_1d
    new-instance v3, Lb7/c;

    .line 493
    .line 494
    const/16 v4, 0x1b

    .line 495
    .line 496
    invoke-direct {v3, v4}, Lb7/c;-><init>(I)V

    .line 497
    .line 498
    .line 499
    iget-object v4, v9, Ln1/j;->e:Le1/h;

    .line 500
    .line 501
    iget-object v4, v4, Le1/h;->a:Ljava/util/HashMap;

    .line 502
    .line 503
    invoke-virtual {v3, v4}, Lb7/c;->L(Ljava/util/HashMap;)V

    .line 504
    .line 505
    .line 506
    iget-object v4, v3, Lb7/c;->b:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v4, Ljava/util/HashMap;

    .line 509
    .line 510
    const-string v10, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 511
    .line 512
    invoke-virtual {v4, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v4

    .line 519
    iput-object v4, v9, Ln1/j;->c:Ljava/lang/String;

    .line 520
    .line 521
    new-instance v4, Le1/h;

    .line 522
    .line 523
    iget-object v3, v3, Lb7/c;->b:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v3, Ljava/util/HashMap;

    .line 526
    .line 527
    invoke-direct {v4, v3}, Le1/h;-><init>(Ljava/util/HashMap;)V

    .line 528
    .line 529
    .line 530
    invoke-static {v4}, Le1/h;->b(Le1/h;)[B

    .line 531
    .line 532
    .line 533
    iput-object v4, v9, Ln1/j;->e:Le1/h;

    .line 534
    .line 535
    goto :goto_14

    .line 536
    :cond_1e
    move-wide/from16 v19, v3

    .line 537
    .line 538
    :cond_1f
    :goto_14
    iget v3, v9, Ln1/j;->b:I

    .line 539
    .line 540
    const/4 v4, 0x1

    .line 541
    if-ne v3, v4, :cond_20

    .line 542
    .line 543
    const/4 v6, 0x1

    .line 544
    :cond_20
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    iget-object v4, v3, LG6/e;->a:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 551
    .line 552
    invoke-virtual {v4}, LG0/E;->b()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v4}, LG0/E;->c()V

    .line 556
    .line 557
    .line 558
    :try_start_1
    iget-object v3, v3, LG6/e;->b:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v3, Ln1/b;

    .line 561
    .line 562
    invoke-virtual {v3, v9}, Ln1/b;->l(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v4}, LG0/E;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 566
    .line 567
    .line 568
    invoke-virtual {v4}, LG0/E;->m()V

    .line 569
    .line 570
    .line 571
    iget-object v3, v2, Le1/s;->a:Ljava/util/UUID;

    .line 572
    .line 573
    if-eqz v8, :cond_21

    .line 574
    .line 575
    array-length v4, v1

    .line 576
    const/4 v9, 0x0

    .line 577
    :goto_15
    if-ge v9, v4, :cond_21

    .line 578
    .line 579
    aget-object v10, v1, v9

    .line 580
    .line 581
    new-instance v12, Ln1/a;

    .line 582
    .line 583
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v13

    .line 587
    invoke-direct {v12, v13, v10}, Ln1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->q()Lk4/E;

    .line 591
    .line 592
    .line 593
    move-result-object v10

    .line 594
    iget-object v13, v10, Lk4/E;->b:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast v13, Landroidx/work/impl/WorkDatabase_Impl;

    .line 597
    .line 598
    invoke-virtual {v13}, LG0/E;->b()V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v13}, LG0/E;->c()V

    .line 602
    .line 603
    .line 604
    :try_start_2
    iget-object v10, v10, Lk4/E;->c:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v10, Ln1/b;

    .line 607
    .line 608
    invoke-virtual {v10, v12}, Ln1/b;->l(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v13}, LG0/E;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 612
    .line 613
    .line 614
    invoke-virtual {v13}, LG0/E;->m()V

    .line 615
    .line 616
    .line 617
    add-int/lit8 v9, v9, 0x1

    .line 618
    .line 619
    goto :goto_15

    .line 620
    :catchall_1
    move-exception v0

    .line 621
    invoke-virtual {v13}, LG0/E;->m()V

    .line 622
    .line 623
    .line 624
    throw v0

    .line 625
    :cond_21
    iget-object v2, v2, Le1/s;->c:Ljava/util/HashSet;

    .line 626
    .line 627
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    if-eqz v4, :cond_22

    .line 636
    .line 637
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    check-cast v4, Ljava/lang/String;

    .line 642
    .line 643
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->w()Lk4/E;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    new-instance v10, Ln1/k;

    .line 648
    .line 649
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v12

    .line 653
    invoke-direct {v10, v4, v12}, Ln1/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    iget-object v4, v9, Lk4/E;->b:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 659
    .line 660
    invoke-virtual {v4}, LG0/E;->b()V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v4}, LG0/E;->c()V

    .line 664
    .line 665
    .line 666
    :try_start_3
    iget-object v9, v9, Lk4/E;->c:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v9, Ln1/b;

    .line 669
    .line 670
    invoke-virtual {v9, v10}, Ln1/b;->l(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v4}, LG0/E;->p()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 674
    .line 675
    .line 676
    invoke-virtual {v4}, LG0/E;->m()V

    .line 677
    .line 678
    .line 679
    goto :goto_16

    .line 680
    :catchall_2
    move-exception v0

    .line 681
    invoke-virtual {v4}, LG0/E;->m()V

    .line 682
    .line 683
    .line 684
    throw v0

    .line 685
    :cond_22
    if-nez v11, :cond_23

    .line 686
    .line 687
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->t()Lk4/E;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    new-instance v4, Ln1/f;

    .line 692
    .line 693
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-direct {v4, v7, v3}, Ln1/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    iget-object v3, v2, Lk4/E;->b:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 703
    .line 704
    invoke-virtual {v3}, LG0/E;->b()V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v3}, LG0/E;->c()V

    .line 708
    .line 709
    .line 710
    :try_start_4
    iget-object v2, v2, Lk4/E;->c:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v2, Ln1/b;

    .line 713
    .line 714
    invoke-virtual {v2, v4}, Ln1/b;->l(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v3}, LG0/E;->p()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 718
    .line 719
    .line 720
    invoke-virtual {v3}, LG0/E;->m()V

    .line 721
    .line 722
    .line 723
    goto :goto_17

    .line 724
    :catchall_3
    move-exception v0

    .line 725
    invoke-virtual {v3}, LG0/E;->m()V

    .line 726
    .line 727
    .line 728
    throw v0

    .line 729
    :cond_23
    :goto_17
    move-wide/from16 v3, v19

    .line 730
    .line 731
    const/4 v10, 0x0

    .line 732
    goto/16 :goto_12

    .line 733
    .line 734
    :catchall_4
    move-exception v0

    .line 735
    invoke-virtual {v4}, LG0/E;->m()V

    .line 736
    .line 737
    .line 738
    throw v0

    .line 739
    :cond_24
    move v2, v6

    .line 740
    goto/16 :goto_2

    .line 741
    .line 742
    :goto_18
    iput-boolean v4, v0, Lf1/e;->s:Z

    .line 743
    .line 744
    return v2
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lo1/d;->b:LO0/c;

    .line 2
    .line 3
    iget-object v1, p0, Lo1/d;->a:Lf1/e;

    .line 4
    .line 5
    const-string v2, "WorkContinuation has cycles ("

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v4, v1, Lf1/e;->q:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {v3, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lf1/e;->g0(Lf1/e;)Ljava/util/HashSet;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v4, v1, Lf1/e;->q:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-interface {v3, v4}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_0
    if-nez v3, :cond_3

    .line 55
    .line 56
    iget-object v2, v1, Lf1/e;->m:Lf1/k;

    .line 57
    .line 58
    :try_start_1
    iget-object v3, v2, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 59
    .line 60
    invoke-virtual {v3}, LG0/E;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    :try_start_2
    invoke-static {v1}, Lo1/d;->a(Lf1/e;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v3}, LG0/E;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    .line 70
    :try_start_3
    invoke-virtual {v3}, LG0/E;->m()V

    .line 71
    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    iget-object v1, v2, Lf1/k;->h:Landroid/content/Context;

    .line 76
    .line 77
    const-class v3, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 78
    .line 79
    const/4 v4, 0x1

    .line 80
    invoke-static {v1, v3, v4}, Lo1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v2, Lf1/k;->i:Le1/b;

    .line 84
    .line 85
    iget-object v3, v2, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 86
    .line 87
    iget-object v2, v2, Lf1/k;->l:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v1, v3, v2}, Lf1/d;->a(Le1/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v1

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    :goto_1
    sget-object v1, Le1/w;->V:Le1/v;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, LO0/c;->P(Ls8/e;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catchall_1
    move-exception v1

    .line 102
    invoke-virtual {v3}, LG0/E;->m()V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_3
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    new-instance v4, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ")"

    .line 117
    .line 118
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 129
    :goto_2
    new-instance v2, Le1/t;

    .line 130
    .line 131
    invoke-direct {v2, v1}, Le1/t;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, LO0/c;->P(Ls8/e;)V

    .line 135
    .line 136
    .line 137
    return-void
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
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
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
