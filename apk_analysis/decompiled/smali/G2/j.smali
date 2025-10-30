.class public final LG2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# instance fields
.field public final a:LG2/v;


# direct methods
.method public constructor <init>(LG2/v;)V
    .locals 1

    .line 1
    const-string v0, "subMapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LG2/j;->a:LG2/v;

    .line 10
    .line 11
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;

    .line 4
    .line 5
    const-string v1, "dto"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    iget-object v3, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->r:Ljava/util/List;

    .line 15
    .line 16
    if-eqz v3, :cond_7

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_0
    invoke-static {v3, v1}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v4}, LB7/y;->D(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/16 v5, 0x10

    .line 34
    .line 35
    if-ge v4, v5, :cond_1

    .line 36
    .line 37
    move v4, v5

    .line 38
    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Lcom/anilab/data/model/response/StreamHeadersResponse;

    .line 58
    .line 59
    iget-object v6, v4, Lcom/anilab/data/model/response/StreamHeadersResponse;->a:Ljava/lang/String;

    .line 60
    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    move-object v6, v2

    .line 64
    :cond_2
    iget-object v4, v4, Lcom/anilab/data/model/response/StreamHeadersResponse;->b:Ljava/lang/String;

    .line 65
    .line 66
    if-nez v4, :cond_3

    .line 67
    .line 68
    move-object v4, v2

    .line 69
    :cond_3
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    :cond_5
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_6

    .line 91
    .line 92
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, Ljava/util/Map$Entry;

    .line 97
    .line 98
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    check-cast v6, Ljava/lang/CharSequence;

    .line 103
    .line 104
    invoke-static {v6}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-nez v6, :cond_5

    .line 109
    .line 110
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    :goto_2
    move-object v7, v3

    .line 123
    goto :goto_4

    .line 124
    :cond_7
    :goto_3
    sget-object v3, Lg6/o;->a:Lg6/o;

    .line 125
    .line 126
    invoke-virtual {v3}, Lg6/o;->W0()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v3}, Lg6/o;->V0()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    new-instance v5, LA7/h;

    .line 135
    .line 136
    invoke-direct {v5, v4, v3}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v5}, LB7/y;->E(LA7/h;)Ljava/util/Map;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    goto :goto_2

    .line 144
    :goto_4
    iget-object v3, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->u:Ljava/util/List;

    .line 145
    .line 146
    invoke-static {v3}, LM4/a;->z(Ljava/util/List;)LA7/h;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iget-object v4, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->v:Ljava/util/List;

    .line 151
    .line 152
    invoke-static {v4}, LM4/a;->z(Ljava/util/List;)LA7/h;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    iget-object v4, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->s:Ljava/util/List;

    .line 157
    .line 158
    invoke-static {v4}, LM4/a;->z(Ljava/util/List;)LA7/h;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    iget-object v4, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->t:Ljava/util/List;

    .line 163
    .line 164
    invoke-static {v4}, LM4/a;->z(Ljava/util/List;)LA7/h;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    iget-object v12, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->p:Lcom/anilab/data/model/response/StreamingResponse;

    .line 169
    .line 170
    if-eqz v12, :cond_8

    .line 171
    .line 172
    iget-object v4, v12, Lcom/anilab/data/model/response/StreamingResponse;->a:Ljava/util/List;

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_8
    const/4 v4, 0x0

    .line 176
    :goto_5
    sget-object v13, LB7/t;->a:LB7/t;

    .line 177
    .line 178
    if-nez v4, :cond_9

    .line 179
    .line 180
    move-object v4, v13

    .line 181
    :cond_9
    new-instance v14, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-static {v4, v1}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    invoke-direct {v14, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    const/16 v16, 0x0

    .line 195
    .line 196
    move/from16 v4, v16

    .line 197
    .line 198
    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_b

    .line 203
    .line 204
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    add-int/lit8 v6, v4, 0x1

    .line 209
    .line 210
    if-ltz v4, :cond_a

    .line 211
    .line 212
    check-cast v5, Ljava/lang/String;

    .line 213
    .line 214
    new-instance v4, LI2/b;

    .line 215
    .line 216
    const/16 p1, 0x0

    .line 217
    .line 218
    const-string v11, "Server S"

    .line 219
    .line 220
    invoke-static {v6, v11}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    move/from16 v29, v6

    .line 225
    .line 226
    move-object v6, v5

    .line 227
    move-object v5, v11

    .line 228
    move/from16 v11, v29

    .line 229
    .line 230
    invoke-direct/range {v4 .. v9}, LI2/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LA7/h;LA7/h;)V

    .line 231
    .line 232
    .line 233
    move-object/from16 v17, v8

    .line 234
    .line 235
    move-object/from16 v18, v9

    .line 236
    .line 237
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move v4, v11

    .line 241
    goto :goto_6

    .line 242
    :cond_a
    const/16 p1, 0x0

    .line 243
    .line 244
    invoke-static {}, LB7/l;->e0()V

    .line 245
    .line 246
    .line 247
    throw p1

    .line 248
    :cond_b
    move-object/from16 v17, v8

    .line 249
    .line 250
    move-object/from16 v18, v9

    .line 251
    .line 252
    const/16 p1, 0x0

    .line 253
    .line 254
    if-eqz v12, :cond_c

    .line 255
    .line 256
    iget-object v4, v12, Lcom/anilab/data/model/response/StreamingResponse;->b:Ljava/util/List;

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_c
    move-object/from16 v4, p1

    .line 260
    .line 261
    :goto_7
    if-nez v4, :cond_d

    .line 262
    .line 263
    move-object v4, v13

    .line 264
    :cond_d
    new-instance v11, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-static {v4, v1}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    invoke-direct {v11, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    move/from16 v4, v16

    .line 278
    .line 279
    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    if-eqz v5, :cond_f

    .line 284
    .line 285
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    add-int/lit8 v15, v4, 0x1

    .line 290
    .line 291
    if-ltz v4, :cond_e

    .line 292
    .line 293
    move-object v6, v5

    .line 294
    check-cast v6, Ljava/lang/String;

    .line 295
    .line 296
    new-instance v4, LI2/b;

    .line 297
    .line 298
    const-string v5, "Server D"

    .line 299
    .line 300
    invoke-static {v15, v5}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    move-object v8, v3

    .line 305
    move-object v9, v10

    .line 306
    invoke-direct/range {v4 .. v9}, LI2/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LA7/h;LA7/h;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move v4, v15

    .line 313
    goto :goto_8

    .line 314
    :cond_e
    invoke-static {}, LB7/l;->e0()V

    .line 315
    .line 316
    .line 317
    throw p1

    .line 318
    :cond_f
    move-object/from16 v20, v14

    .line 319
    .line 320
    new-instance v14, LI2/a;

    .line 321
    .line 322
    iget-object v5, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->a:Ljava/lang/Long;

    .line 323
    .line 324
    if-eqz v5, :cond_10

    .line 325
    .line 326
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 327
    .line 328
    .line 329
    move-result-wide v5

    .line 330
    move-wide/from16 v29, v5

    .line 331
    .line 332
    move/from16 v5, v16

    .line 333
    .line 334
    move-wide/from16 v15, v29

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_10
    move/from16 v5, v16

    .line 338
    .line 339
    const-wide/16 v15, 0x0

    .line 340
    .line 341
    :goto_9
    iget-object v6, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->d:Ljava/lang/Integer;

    .line 342
    .line 343
    if-eqz v6, :cond_11

    .line 344
    .line 345
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    move-object/from16 v8, v17

    .line 350
    .line 351
    move/from16 v17, v6

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :cond_11
    move-object/from16 v8, v17

    .line 355
    .line 356
    move/from16 v17, v5

    .line 357
    .line 358
    :goto_a
    iget-object v6, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->f:Ljava/lang/String;

    .line 359
    .line 360
    if-nez v6, :cond_12

    .line 361
    .line 362
    iget-object v6, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->e:Ljava/lang/String;

    .line 363
    .line 364
    if-nez v6, :cond_12

    .line 365
    .line 366
    iget-object v6, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->g:Ljava/lang/String;

    .line 367
    .line 368
    if-nez v6, :cond_12

    .line 369
    .line 370
    move-object v10, v2

    .line 371
    goto :goto_b

    .line 372
    :cond_12
    move-object v10, v6

    .line 373
    :goto_b
    iget-object v0, v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->q:Ljava/util/List;

    .line 374
    .line 375
    if-nez v0, :cond_13

    .line 376
    .line 377
    :goto_c
    move-object/from16 v0, p0

    .line 378
    .line 379
    goto :goto_d

    .line 380
    :cond_13
    move-object v13, v0

    .line 381
    goto :goto_c

    .line 382
    :goto_d
    iget-object v6, v0, LG2/j;->a:LG2/v;

    .line 383
    .line 384
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 388
    .line 389
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 390
    .line 391
    .line 392
    new-instance v9, Ljava/util/ArrayList;

    .line 393
    .line 394
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 398
    .line 399
    .line 400
    move-result-object v12

    .line 401
    :cond_14
    :goto_e
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v13

    .line 405
    if-eqz v13, :cond_18

    .line 406
    .line 407
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v13

    .line 411
    const-wide/16 v21, 0x0

    .line 412
    .line 413
    move-object v3, v13

    .line 414
    check-cast v3, Lcom/anilab/data/model/response/SubResponse;

    .line 415
    .line 416
    iget-object v4, v3, Lcom/anilab/data/model/response/SubResponse;->a:Ljava/lang/Long;

    .line 417
    .line 418
    if-nez v4, :cond_15

    .line 419
    .line 420
    goto :goto_f

    .line 421
    :cond_15
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 422
    .line 423
    .line 424
    move-result-wide v23

    .line 425
    cmp-long v4, v23, v21

    .line 426
    .line 427
    if-eqz v4, :cond_14

    .line 428
    .line 429
    :goto_f
    iget-object v4, v3, Lcom/anilab/data/model/response/SubResponse;->b:Ljava/lang/String;

    .line 430
    .line 431
    if-eqz v4, :cond_14

    .line 432
    .line 433
    invoke-static {v4}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    if-eqz v4, :cond_16

    .line 438
    .line 439
    goto :goto_e

    .line 440
    :cond_16
    iget-object v3, v3, Lcom/anilab/data/model/response/SubResponse;->d:Ljava/lang/String;

    .line 441
    .line 442
    if-eqz v3, :cond_14

    .line 443
    .line 444
    invoke-static {v3}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-eqz v3, :cond_17

    .line 449
    .line 450
    goto :goto_e

    .line 451
    :cond_17
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    goto :goto_e

    .line 455
    :cond_18
    const-wide/16 v21, 0x0

    .line 456
    .line 457
    new-instance v3, Ljava/util/ArrayList;

    .line 458
    .line 459
    invoke-static {v9, v1}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    move v4, v5

    .line 471
    :goto_10
    if-ge v4, v1, :cond_1f

    .line 472
    .line 473
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v12

    .line 477
    add-int/lit8 v4, v4, 0x1

    .line 478
    .line 479
    check-cast v12, Lcom/anilab/data/model/response/SubResponse;

    .line 480
    .line 481
    iget-object v13, v12, Lcom/anilab/data/model/response/SubResponse;->b:Ljava/lang/String;

    .line 482
    .line 483
    if-nez v13, :cond_19

    .line 484
    .line 485
    move-object v13, v2

    .line 486
    :cond_19
    invoke-virtual {v6, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v19

    .line 490
    if-nez v19, :cond_1a

    .line 491
    .line 492
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 493
    .line 494
    .line 495
    move-result-object v19

    .line 496
    :cond_1a
    check-cast v19, Ljava/lang/Number;

    .line 497
    .line 498
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Number;->intValue()I

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    add-int/lit8 v19, v5, 0x1

    .line 503
    .line 504
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-interface {v6, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    if-nez v5, :cond_1b

    .line 512
    .line 513
    :goto_11
    move-object/from16 v27, v13

    .line 514
    .line 515
    goto :goto_12

    .line 516
    :cond_1b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    const-string v13, " ("

    .line 525
    .line 526
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    const-string v5, ")"

    .line 533
    .line 534
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v13

    .line 541
    goto :goto_11

    .line 542
    :goto_12
    new-instance v23, LI2/c;

    .line 543
    .line 544
    iget-object v0, v12, Lcom/anilab/data/model/response/SubResponse;->a:Ljava/lang/Long;

    .line 545
    .line 546
    if-eqz v0, :cond_1c

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 549
    .line 550
    .line 551
    move-result-wide v24

    .line 552
    goto :goto_13

    .line 553
    :cond_1c
    move-wide/from16 v24, v21

    .line 554
    .line 555
    :goto_13
    iget-object v0, v12, Lcom/anilab/data/model/response/SubResponse;->c:Ljava/lang/String;

    .line 556
    .line 557
    if-nez v0, :cond_1d

    .line 558
    .line 559
    move-object/from16 v26, v2

    .line 560
    .line 561
    goto :goto_14

    .line 562
    :cond_1d
    move-object/from16 v26, v0

    .line 563
    .line 564
    :goto_14
    iget-object v0, v12, Lcom/anilab/data/model/response/SubResponse;->d:Ljava/lang/String;

    .line 565
    .line 566
    if-nez v0, :cond_1e

    .line 567
    .line 568
    move-object/from16 v28, v2

    .line 569
    .line 570
    goto :goto_15

    .line 571
    :cond_1e
    move-object/from16 v28, v0

    .line 572
    .line 573
    :goto_15
    invoke-direct/range {v23 .. v28}, LI2/c;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    move-object/from16 v0, v23

    .line 577
    .line 578
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-object/from16 v0, p0

    .line 582
    .line 583
    const/4 v5, 0x0

    .line 584
    goto :goto_10

    .line 585
    :cond_1f
    new-instance v0, LB/j;

    .line 586
    .line 587
    const/4 v1, 0x4

    .line 588
    invoke-direct {v0, v1}, LB/j;-><init>(I)V

    .line 589
    .line 590
    .line 591
    invoke-static {v3, v0}, LB7/k;->C0(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v19

    .line 595
    new-instance v4, LI2/b;

    .line 596
    .line 597
    invoke-static/range {v20 .. v20}, LB7/k;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    check-cast v0, LI2/b;

    .line 602
    .line 603
    if-eqz v0, :cond_21

    .line 604
    .line 605
    iget-object v0, v0, LI2/b;->a:Ljava/lang/String;

    .line 606
    .line 607
    if-nez v0, :cond_20

    .line 608
    .line 609
    goto :goto_17

    .line 610
    :cond_20
    :goto_16
    move-object v5, v0

    .line 611
    goto :goto_18

    .line 612
    :cond_21
    :goto_17
    invoke-static {v11}, LB7/k;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    check-cast v0, LI2/b;

    .line 617
    .line 618
    if-eqz v0, :cond_22

    .line 619
    .line 620
    iget-object v0, v0, LI2/b;->a:Ljava/lang/String;

    .line 621
    .line 622
    goto :goto_16

    .line 623
    :cond_22
    move-object v5, v2

    .line 624
    :goto_18
    invoke-static/range {v20 .. v20}, LB7/k;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    check-cast v0, LI2/b;

    .line 629
    .line 630
    if-eqz v0, :cond_24

    .line 631
    .line 632
    iget-object v0, v0, LI2/b;->b:Ljava/lang/String;

    .line 633
    .line 634
    if-nez v0, :cond_23

    .line 635
    .line 636
    goto :goto_1a

    .line 637
    :cond_23
    move-object v6, v0

    .line 638
    :goto_19
    move-object/from16 v9, v18

    .line 639
    .line 640
    goto :goto_1b

    .line 641
    :cond_24
    :goto_1a
    invoke-static {v11}, LB7/k;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    check-cast v0, LI2/b;

    .line 646
    .line 647
    if-eqz v0, :cond_25

    .line 648
    .line 649
    iget-object v2, v0, LI2/b;->b:Ljava/lang/String;

    .line 650
    .line 651
    :cond_25
    move-object v6, v2

    .line 652
    goto :goto_19

    .line 653
    :goto_1b
    invoke-direct/range {v4 .. v9}, LI2/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LA7/h;LA7/h;)V

    .line 654
    .line 655
    .line 656
    const/16 v25, 0x0

    .line 657
    .line 658
    const/16 v28, 0x1b80

    .line 659
    .line 660
    const-wide/16 v23, 0x0

    .line 661
    .line 662
    const/16 v26, 0x0

    .line 663
    .line 664
    const/16 v27, 0x0

    .line 665
    .line 666
    move-object/from16 v22, v4

    .line 667
    .line 668
    move-object/from16 v18, v10

    .line 669
    .line 670
    move-object/from16 v21, v11

    .line 671
    .line 672
    invoke-direct/range {v14 .. v28}, LI2/a;-><init>(JILjava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;LI2/b;JZZZI)V

    .line 673
    .line 674
    .line 675
    return-object v14
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method
