.class public final LW/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LW/e;->a:I

    iput-object p2, p0, LW/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LW/e;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LW/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lb5/G1;

    .line 11
    .line 12
    iget-object v1, v1, Lb5/G1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lb7/c;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    iget-object v1, v1, Lb7/c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lc0/a;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    const/4 v6, 0x0

    .line 35
    move v7, v6

    .line 36
    :goto_0
    iget-object v8, v1, Lc0/a;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-ge v7, v9, :cond_e

    .line 43
    .line 44
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    check-cast v8, Lc0/d;

    .line 49
    .line 50
    if-nez v8, :cond_1

    .line 51
    .line 52
    :cond_0
    :goto_1
    move/from16 v29, v7

    .line 53
    .line 54
    goto/16 :goto_8

    .line 55
    .line 56
    :cond_1
    iget-object v9, v1, Lc0/a;->a:Ls/i;

    .line 57
    .line 58
    invoke-virtual {v9, v8}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    check-cast v11, Ljava/lang/Long;

    .line 63
    .line 64
    if-nez v11, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v11

    .line 71
    cmp-long v11, v11, v4

    .line 72
    .line 73
    if-gez v11, :cond_0

    .line 74
    .line 75
    invoke-virtual {v9, v8}, Ls/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :goto_2
    iget-wide v11, v8, Lc0/d;->g:J

    .line 79
    .line 80
    const-wide/16 v13, 0x0

    .line 81
    .line 82
    cmp-long v9, v11, v13

    .line 83
    .line 84
    if-nez v9, :cond_3

    .line 85
    .line 86
    iput-wide v2, v8, Lc0/d;->g:J

    .line 87
    .line 88
    iget v9, v8, Lc0/d;->b:F

    .line 89
    .line 90
    invoke-virtual {v8, v9}, Lc0/d;->a(F)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    sub-long v20, v2, v11

    .line 95
    .line 96
    iput-wide v2, v8, Lc0/d;->g:J

    .line 97
    .line 98
    iget-boolean v9, v8, Lc0/d;->m:Z

    .line 99
    .line 100
    const v12, 0x7f7fffff    # Float.MAX_VALUE

    .line 101
    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    if-eqz v9, :cond_5

    .line 105
    .line 106
    iget v9, v8, Lc0/d;->l:F

    .line 107
    .line 108
    cmpl-float v16, v9, v12

    .line 109
    .line 110
    if-eqz v16, :cond_4

    .line 111
    .line 112
    iget-object v13, v8, Lc0/d;->k:Lc0/e;

    .line 113
    .line 114
    float-to-double v10, v9

    .line 115
    iput-wide v10, v13, Lc0/e;->i:D

    .line 116
    .line 117
    iput v12, v8, Lc0/d;->l:F

    .line 118
    .line 119
    :cond_4
    iget-object v9, v8, Lc0/d;->k:Lc0/e;

    .line 120
    .line 121
    iget-wide v9, v9, Lc0/e;->i:D

    .line 122
    .line 123
    double-to-float v9, v9

    .line 124
    iput v9, v8, Lc0/d;->b:F

    .line 125
    .line 126
    iput v15, v8, Lc0/d;->a:F

    .line 127
    .line 128
    iput-boolean v6, v8, Lc0/d;->m:Z

    .line 129
    .line 130
    move/from16 v29, v7

    .line 131
    .line 132
    :goto_3
    const/4 v14, 0x1

    .line 133
    goto/16 :goto_5

    .line 134
    .line 135
    :cond_5
    iget v9, v8, Lc0/d;->l:F

    .line 136
    .line 137
    cmpl-float v9, v9, v12

    .line 138
    .line 139
    if-eqz v9, :cond_6

    .line 140
    .line 141
    iget-object v9, v8, Lc0/d;->k:Lc0/e;

    .line 142
    .line 143
    iget-wide v10, v9, Lc0/e;->i:D

    .line 144
    .line 145
    iget v10, v8, Lc0/d;->b:F

    .line 146
    .line 147
    float-to-double v10, v10

    .line 148
    iget v13, v8, Lc0/d;->a:F

    .line 149
    .line 150
    float-to-double v14, v13

    .line 151
    const-wide/16 v17, 0x2

    .line 152
    .line 153
    div-long v27, v20, v17

    .line 154
    .line 155
    move-object/from16 v22, v9

    .line 156
    .line 157
    move-wide/from16 v23, v10

    .line 158
    .line 159
    move-wide/from16 v25, v14

    .line 160
    .line 161
    invoke-virtual/range {v22 .. v28}, Lc0/e;->a(DDJ)Lc0/c;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    iget-object v10, v8, Lc0/d;->k:Lc0/e;

    .line 166
    .line 167
    iget v11, v8, Lc0/d;->l:F

    .line 168
    .line 169
    float-to-double v13, v11

    .line 170
    iput-wide v13, v10, Lc0/e;->i:D

    .line 171
    .line 172
    iput v12, v8, Lc0/d;->l:F

    .line 173
    .line 174
    iget v11, v9, Lc0/c;->a:F

    .line 175
    .line 176
    float-to-double v13, v11

    .line 177
    iget v9, v9, Lc0/c;->b:F

    .line 178
    .line 179
    move/from16 v29, v7

    .line 180
    .line 181
    float-to-double v6, v9

    .line 182
    move-wide/from16 v25, v6

    .line 183
    .line 184
    move-object/from16 v22, v10

    .line 185
    .line 186
    move-wide/from16 v23, v13

    .line 187
    .line 188
    invoke-virtual/range {v22 .. v28}, Lc0/e;->a(DDJ)Lc0/c;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    iget v7, v6, Lc0/c;->a:F

    .line 193
    .line 194
    iput v7, v8, Lc0/d;->b:F

    .line 195
    .line 196
    iget v6, v6, Lc0/c;->b:F

    .line 197
    .line 198
    iput v6, v8, Lc0/d;->a:F

    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    goto :goto_4

    .line 202
    :cond_6
    move/from16 v29, v7

    .line 203
    .line 204
    iget-object v15, v8, Lc0/d;->k:Lc0/e;

    .line 205
    .line 206
    iget v6, v8, Lc0/d;->b:F

    .line 207
    .line 208
    float-to-double v6, v6

    .line 209
    iget v9, v8, Lc0/d;->a:F

    .line 210
    .line 211
    float-to-double v9, v9

    .line 212
    move-wide/from16 v16, v6

    .line 213
    .line 214
    move-wide/from16 v18, v9

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    invoke-virtual/range {v15 .. v21}, Lc0/e;->a(DDJ)Lc0/c;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    iget v9, v7, Lc0/c;->a:F

    .line 222
    .line 223
    iput v9, v8, Lc0/d;->b:F

    .line 224
    .line 225
    iget v7, v7, Lc0/c;->b:F

    .line 226
    .line 227
    iput v7, v8, Lc0/d;->a:F

    .line 228
    .line 229
    :goto_4
    iget v7, v8, Lc0/d;->b:F

    .line 230
    .line 231
    const v9, -0x800001

    .line 232
    .line 233
    .line 234
    invoke-static {v7, v9}, Ljava/lang/Math;->max(FF)F

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    iput v7, v8, Lc0/d;->b:F

    .line 239
    .line 240
    invoke-static {v7, v12}, Ljava/lang/Math;->min(FF)F

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    iput v7, v8, Lc0/d;->b:F

    .line 245
    .line 246
    iget v9, v8, Lc0/d;->a:F

    .line 247
    .line 248
    iget-object v10, v8, Lc0/d;->k:Lc0/e;

    .line 249
    .line 250
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    float-to-double v13, v9

    .line 258
    iget-wide v11, v10, Lc0/e;->e:D

    .line 259
    .line 260
    cmpg-double v11, v13, v11

    .line 261
    .line 262
    if-gez v11, :cond_7

    .line 263
    .line 264
    iget-wide v11, v10, Lc0/e;->i:D

    .line 265
    .line 266
    double-to-float v11, v11

    .line 267
    sub-float/2addr v7, v11

    .line 268
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    float-to-double v11, v7

    .line 273
    iget-wide v13, v10, Lc0/e;->d:D

    .line 274
    .line 275
    cmpg-double v7, v11, v13

    .line 276
    .line 277
    if-gez v7, :cond_7

    .line 278
    .line 279
    iget-object v7, v8, Lc0/d;->k:Lc0/e;

    .line 280
    .line 281
    iget-wide v10, v7, Lc0/e;->i:D

    .line 282
    .line 283
    double-to-float v7, v10

    .line 284
    iput v7, v8, Lc0/d;->b:F

    .line 285
    .line 286
    iput v6, v8, Lc0/d;->a:F

    .line 287
    .line 288
    goto/16 :goto_3

    .line 289
    .line 290
    :cond_7
    const/4 v14, 0x0

    .line 291
    :goto_5
    iget v6, v8, Lc0/d;->b:F

    .line 292
    .line 293
    const v9, 0x7f7fffff    # Float.MAX_VALUE

    .line 294
    .line 295
    .line 296
    invoke-static {v6, v9}, Ljava/lang/Math;->min(FF)F

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    iput v6, v8, Lc0/d;->b:F

    .line 301
    .line 302
    const v9, -0x800001

    .line 303
    .line 304
    .line 305
    invoke-static {v6, v9}, Ljava/lang/Math;->max(FF)F

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    iput v6, v8, Lc0/d;->b:F

    .line 310
    .line 311
    invoke-virtual {v8, v6}, Lc0/d;->a(F)V

    .line 312
    .line 313
    .line 314
    if-eqz v14, :cond_d

    .line 315
    .line 316
    const/4 v11, 0x0

    .line 317
    iput-boolean v11, v8, Lc0/d;->f:Z

    .line 318
    .line 319
    sget-object v6, Lc0/a;->f:Ljava/lang/ThreadLocal;

    .line 320
    .line 321
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    if-nez v7, :cond_8

    .line 326
    .line 327
    new-instance v7, Lc0/a;

    .line 328
    .line 329
    invoke-direct {v7}, Lc0/a;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v6, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :cond_8
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    check-cast v6, Lc0/a;

    .line 340
    .line 341
    iget-object v7, v6, Lc0/a;->a:Ls/i;

    .line 342
    .line 343
    invoke-virtual {v7, v8}, Ls/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    iget-object v7, v6, Lc0/a;->b:Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    if-ltz v9, :cond_9

    .line 353
    .line 354
    const/4 v10, 0x0

    .line 355
    invoke-virtual {v7, v9, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    const/4 v14, 0x1

    .line 359
    iput-boolean v14, v6, Lc0/a;->e:Z

    .line 360
    .line 361
    :cond_9
    const-wide/16 v6, 0x0

    .line 362
    .line 363
    iput-wide v6, v8, Lc0/d;->g:J

    .line 364
    .line 365
    const/4 v11, 0x0

    .line 366
    iput-boolean v11, v8, Lc0/d;->c:Z

    .line 367
    .line 368
    const/4 v15, 0x0

    .line 369
    :goto_6
    iget-object v6, v8, Lc0/d;->i:Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 372
    .line 373
    .line 374
    move-result v7

    .line 375
    if-ge v15, v7, :cond_b

    .line 376
    .line 377
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    if-nez v7, :cond_a

    .line 382
    .line 383
    add-int/lit8 v15, v15, 0x1

    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_a
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    new-instance v1, Ljava/lang/ClassCastException;

    .line 394
    .line 395
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 396
    .line 397
    .line 398
    throw v1

    .line 399
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    const/4 v14, 0x1

    .line 404
    sub-int/2addr v7, v14

    .line 405
    :goto_7
    if-ltz v7, :cond_d

    .line 406
    .line 407
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    if-nez v8, :cond_c

    .line 412
    .line 413
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    :cond_c
    add-int/lit8 v7, v7, -0x1

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_d
    :goto_8
    add-int/lit8 v7, v29, 0x1

    .line 420
    .line 421
    const/4 v6, 0x0

    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :cond_e
    iget-boolean v2, v1, Lc0/a;->e:Z

    .line 425
    .line 426
    if-eqz v2, :cond_11

    .line 427
    .line 428
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    const/4 v14, 0x1

    .line 433
    sub-int/2addr v2, v14

    .line 434
    :goto_9
    if-ltz v2, :cond_10

    .line 435
    .line 436
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    if-nez v3, :cond_f

    .line 441
    .line 442
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    :cond_f
    add-int/lit8 v2, v2, -0x1

    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_10
    const/4 v11, 0x0

    .line 449
    iput-boolean v11, v1, Lc0/a;->e:Z

    .line 450
    .line 451
    :cond_11
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    if-lez v2, :cond_13

    .line 456
    .line 457
    iget-object v2, v1, Lc0/a;->d:Lb5/G1;

    .line 458
    .line 459
    if-nez v2, :cond_12

    .line 460
    .line 461
    new-instance v2, Lb5/G1;

    .line 462
    .line 463
    iget-object v3, v1, Lc0/a;->c:Lb7/c;

    .line 464
    .line 465
    invoke-direct {v2, v3}, Lb5/G1;-><init>(Lb7/c;)V

    .line 466
    .line 467
    .line 468
    iput-object v2, v1, Lc0/a;->d:Lb5/G1;

    .line 469
    .line 470
    :cond_12
    iget-object v1, v1, Lc0/a;->d:Lb5/G1;

    .line 471
    .line 472
    iget-object v2, v1, Lb5/G1;->d:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v2, LW/e;

    .line 475
    .line 476
    iget-object v1, v1, Lb5/G1;->c:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v1, Landroid/view/Choreographer;

    .line 479
    .line 480
    invoke-virtual {v1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 481
    .line 482
    .line 483
    :cond_13
    return-void

    .line 484
    :pswitch_0
    iget-object v1, v0, LW/e;->b:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v1, LW/g;

    .line 487
    .line 488
    iget-object v1, v1, LW/g;->h:LA4/e;

    .line 489
    .line 490
    invoke-virtual {v1}, LA4/e;->run()V

    .line 491
    .line 492
    .line 493
    return-void

    .line 494
    nop

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
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
