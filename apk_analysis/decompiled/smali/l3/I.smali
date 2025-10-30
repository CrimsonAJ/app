.class public final Ll3/I;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll3/I;->g:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public a(Lx/d;Ly/b;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget v3, v1, Lx/d;->V:I

    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-ne v3, v4, :cond_1

    .line 16
    .line 17
    iput v5, v2, Ly/b;->e:I

    .line 18
    .line 19
    iput v5, v2, Ly/b;->f:I

    .line 20
    .line 21
    iput v5, v2, Ly/b;->g:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget v3, v2, Ly/b;->a:I

    .line 25
    .line 26
    iget v4, v2, Ly/b;->b:I

    .line 27
    .line 28
    iget v6, v2, Ly/b;->c:I

    .line 29
    .line 30
    iget v7, v2, Ly/b;->d:I

    .line 31
    .line 32
    iget v8, v0, Ll3/I;->a:I

    .line 33
    .line 34
    iget v9, v0, Ll3/I;->b:I

    .line 35
    .line 36
    add-int/2addr v8, v9

    .line 37
    iget v9, v0, Ll3/I;->c:I

    .line 38
    .line 39
    iget-object v10, v1, Lx/d;->U:Landroid/view/View;

    .line 40
    .line 41
    invoke-static {v3}, Lw/h;->b(I)I

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    iget-object v12, v1, Lx/d;->z:Lx/c;

    .line 46
    .line 47
    iget-object v13, v1, Lx/d;->x:Lx/c;

    .line 48
    .line 49
    iget-object v14, v1, Lx/d;->g:[I

    .line 50
    .line 51
    const/4 v15, 0x1

    .line 52
    move/from16 v16, v5

    .line 53
    .line 54
    const/4 v5, 0x2

    .line 55
    if-eqz v11, :cond_c

    .line 56
    .line 57
    if-eq v11, v15, :cond_b

    .line 58
    .line 59
    if-eq v11, v5, :cond_5

    .line 60
    .line 61
    const/4 v6, 0x3

    .line 62
    if-eq v11, v6, :cond_2

    .line 63
    .line 64
    move/from16 v19, v5

    .line 65
    .line 66
    move/from16 v5, v16

    .line 67
    .line 68
    move v6, v5

    .line 69
    goto/16 :goto_8

    .line 70
    .line 71
    :cond_2
    iget v6, v0, Ll3/I;->e:I

    .line 72
    .line 73
    if-eqz v13, :cond_3

    .line 74
    .line 75
    iget v11, v13, Lx/c;->e:I

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move/from16 v11, v16

    .line 79
    .line 80
    :goto_0
    if-eqz v12, :cond_4

    .line 81
    .line 82
    move/from16 v19, v5

    .line 83
    .line 84
    iget v5, v12, Lx/c;->e:I

    .line 85
    .line 86
    add-int/2addr v11, v5

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move/from16 v19, v5

    .line 89
    .line 90
    :goto_1
    add-int/2addr v9, v11

    .line 91
    const/4 v5, -0x1

    .line 92
    invoke-static {v6, v9, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    aput v5, v14, v19

    .line 97
    .line 98
    :goto_2
    move/from16 v5, v16

    .line 99
    .line 100
    goto/16 :goto_8

    .line 101
    .line 102
    :cond_5
    move/from16 v19, v5

    .line 103
    .line 104
    iget v5, v0, Ll3/I;->e:I

    .line 105
    .line 106
    const/4 v6, -0x2

    .line 107
    invoke-static {v5, v9, v6}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    iget v6, v1, Lx/d;->j:I

    .line 112
    .line 113
    if-ne v6, v15, :cond_6

    .line 114
    .line 115
    move v6, v15

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    move/from16 v6, v16

    .line 118
    .line 119
    :goto_3
    aput v16, v14, v19

    .line 120
    .line 121
    iget-boolean v9, v2, Ly/b;->j:Z

    .line 122
    .line 123
    if-eqz v9, :cond_9

    .line 124
    .line 125
    if-eqz v6, :cond_8

    .line 126
    .line 127
    const/16 v17, 0x3

    .line 128
    .line 129
    aget v9, v14, v17

    .line 130
    .line 131
    if-eqz v9, :cond_8

    .line 132
    .line 133
    aget v9, v14, v16

    .line 134
    .line 135
    invoke-virtual {v1}, Lx/d;->l()I

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-ne v9, v11, :cond_7

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    move v9, v15

    .line 143
    goto :goto_5

    .line 144
    :cond_8
    :goto_4
    move/from16 v9, v16

    .line 145
    .line 146
    :goto_5
    if-eqz v6, :cond_a

    .line 147
    .line 148
    if-eqz v9, :cond_9

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_9
    const/high16 v11, 0x40000000    # 2.0f

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_a
    :goto_6
    invoke-virtual {v1}, Lx/d;->l()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    const/high16 v11, 0x40000000    # 2.0f

    .line 159
    .line 160
    invoke-static {v5, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    goto :goto_2

    .line 165
    :goto_7
    move v6, v5

    .line 166
    move v5, v15

    .line 167
    goto :goto_8

    .line 168
    :cond_b
    move/from16 v19, v5

    .line 169
    .line 170
    const/high16 v11, 0x40000000    # 2.0f

    .line 171
    .line 172
    iget v5, v0, Ll3/I;->e:I

    .line 173
    .line 174
    const/4 v6, -0x2

    .line 175
    invoke-static {v5, v9, v6}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    aput v6, v14, v19

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_c
    move/from16 v19, v5

    .line 183
    .line 184
    const/high16 v11, 0x40000000    # 2.0f

    .line 185
    .line 186
    invoke-static {v6, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    aput v6, v14, v19

    .line 191
    .line 192
    move v6, v5

    .line 193
    goto :goto_2

    .line 194
    :goto_8
    invoke-static {v4}, Lw/h;->b(I)I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-eqz v9, :cond_17

    .line 199
    .line 200
    if-eq v9, v15, :cond_16

    .line 201
    .line 202
    move/from16 v7, v19

    .line 203
    .line 204
    if-eq v9, v7, :cond_10

    .line 205
    .line 206
    const/4 v7, 0x3

    .line 207
    if-eq v9, v7, :cond_d

    .line 208
    .line 209
    move v8, v7

    .line 210
    move/from16 v7, v16

    .line 211
    .line 212
    move v9, v7

    .line 213
    goto/16 :goto_10

    .line 214
    .line 215
    :cond_d
    iget v7, v0, Ll3/I;->f:I

    .line 216
    .line 217
    if-eqz v13, :cond_e

    .line 218
    .line 219
    iget-object v9, v1, Lx/d;->y:Lx/c;

    .line 220
    .line 221
    iget v9, v9, Lx/c;->e:I

    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_e
    move/from16 v9, v16

    .line 225
    .line 226
    :goto_9
    if-eqz v12, :cond_f

    .line 227
    .line 228
    iget-object v11, v1, Lx/d;->A:Lx/c;

    .line 229
    .line 230
    iget v11, v11, Lx/c;->e:I

    .line 231
    .line 232
    add-int/2addr v9, v11

    .line 233
    :cond_f
    add-int/2addr v8, v9

    .line 234
    const/4 v9, -0x1

    .line 235
    invoke-static {v7, v8, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    const/16 v17, 0x3

    .line 240
    .line 241
    aput v9, v14, v17

    .line 242
    .line 243
    move/from16 v9, v16

    .line 244
    .line 245
    move/from16 v8, v17

    .line 246
    .line 247
    goto/16 :goto_10

    .line 248
    .line 249
    :cond_10
    const/16 v17, 0x3

    .line 250
    .line 251
    iget v7, v0, Ll3/I;->f:I

    .line 252
    .line 253
    const/4 v9, -0x2

    .line 254
    invoke-static {v7, v8, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    iget v8, v1, Lx/d;->k:I

    .line 259
    .line 260
    if-ne v8, v15, :cond_11

    .line 261
    .line 262
    move v8, v15

    .line 263
    goto :goto_a

    .line 264
    :cond_11
    move/from16 v8, v16

    .line 265
    .line 266
    :goto_a
    aput v16, v14, v17

    .line 267
    .line 268
    iget-boolean v9, v2, Ly/b;->j:Z

    .line 269
    .line 270
    if-eqz v9, :cond_14

    .line 271
    .line 272
    if-eqz v8, :cond_13

    .line 273
    .line 274
    const/16 v19, 0x2

    .line 275
    .line 276
    aget v9, v14, v19

    .line 277
    .line 278
    if-eqz v9, :cond_13

    .line 279
    .line 280
    aget v9, v14, v15

    .line 281
    .line 282
    invoke-virtual {v1}, Lx/d;->i()I

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-ne v9, v11, :cond_12

    .line 287
    .line 288
    goto :goto_b

    .line 289
    :cond_12
    move v9, v15

    .line 290
    goto :goto_c

    .line 291
    :cond_13
    :goto_b
    move/from16 v9, v16

    .line 292
    .line 293
    :goto_c
    if-eqz v8, :cond_15

    .line 294
    .line 295
    if-eqz v9, :cond_14

    .line 296
    .line 297
    goto :goto_d

    .line 298
    :cond_14
    const/high16 v11, 0x40000000    # 2.0f

    .line 299
    .line 300
    goto :goto_f

    .line 301
    :cond_15
    :goto_d
    invoke-virtual {v1}, Lx/d;->i()I

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    const/high16 v11, 0x40000000    # 2.0f

    .line 306
    .line 307
    invoke-static {v7, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    move/from16 v9, v16

    .line 312
    .line 313
    :goto_e
    const/4 v8, 0x3

    .line 314
    goto :goto_10

    .line 315
    :goto_f
    move v9, v15

    .line 316
    goto :goto_e

    .line 317
    :cond_16
    const/high16 v11, 0x40000000    # 2.0f

    .line 318
    .line 319
    iget v7, v0, Ll3/I;->f:I

    .line 320
    .line 321
    const/4 v9, -0x2

    .line 322
    invoke-static {v7, v8, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    const/4 v8, 0x3

    .line 327
    aput v9, v14, v8

    .line 328
    .line 329
    move v9, v15

    .line 330
    goto :goto_10

    .line 331
    :cond_17
    const/4 v8, 0x3

    .line 332
    const/high16 v11, 0x40000000    # 2.0f

    .line 333
    .line 334
    invoke-static {v7, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    aput v7, v14, v8

    .line 339
    .line 340
    move v7, v9

    .line 341
    move/from16 v9, v16

    .line 342
    .line 343
    :goto_10
    if-ne v3, v8, :cond_18

    .line 344
    .line 345
    move v11, v15

    .line 346
    goto :goto_11

    .line 347
    :cond_18
    move/from16 v11, v16

    .line 348
    .line 349
    :goto_11
    if-ne v4, v8, :cond_19

    .line 350
    .line 351
    move v8, v15

    .line 352
    goto :goto_12

    .line 353
    :cond_19
    move/from16 v8, v16

    .line 354
    .line 355
    :goto_12
    const/4 v12, 0x4

    .line 356
    if-eq v4, v12, :cond_1b

    .line 357
    .line 358
    if-ne v4, v15, :cond_1a

    .line 359
    .line 360
    goto :goto_13

    .line 361
    :cond_1a
    move/from16 v4, v16

    .line 362
    .line 363
    goto :goto_14

    .line 364
    :cond_1b
    :goto_13
    move v4, v15

    .line 365
    :goto_14
    if-eq v3, v12, :cond_1d

    .line 366
    .line 367
    if-ne v3, v15, :cond_1c

    .line 368
    .line 369
    goto :goto_15

    .line 370
    :cond_1c
    move/from16 v3, v16

    .line 371
    .line 372
    goto :goto_16

    .line 373
    :cond_1d
    :goto_15
    move v3, v15

    .line 374
    :goto_16
    const/4 v12, 0x0

    .line 375
    if-eqz v11, :cond_1e

    .line 376
    .line 377
    iget v13, v1, Lx/d;->L:F

    .line 378
    .line 379
    cmpl-float v13, v13, v12

    .line 380
    .line 381
    if-lez v13, :cond_1e

    .line 382
    .line 383
    move v13, v15

    .line 384
    goto :goto_17

    .line 385
    :cond_1e
    move/from16 v13, v16

    .line 386
    .line 387
    :goto_17
    if-eqz v8, :cond_1f

    .line 388
    .line 389
    move/from16 v18, v12

    .line 390
    .line 391
    iget v12, v1, Lx/d;->L:F

    .line 392
    .line 393
    cmpl-float v12, v12, v18

    .line 394
    .line 395
    if-lez v12, :cond_1f

    .line 396
    .line 397
    move v12, v15

    .line 398
    goto :goto_18

    .line 399
    :cond_1f
    move/from16 v12, v16

    .line 400
    .line 401
    :goto_18
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 402
    .line 403
    .line 404
    move-result-object v18

    .line 405
    move/from16 v20, v15

    .line 406
    .line 407
    move-object/from16 v15, v18

    .line 408
    .line 409
    check-cast v15, Lz/e;

    .line 410
    .line 411
    iget-boolean v0, v2, Ly/b;->j:Z

    .line 412
    .line 413
    if-nez v0, :cond_22

    .line 414
    .line 415
    if-eqz v11, :cond_22

    .line 416
    .line 417
    iget v0, v1, Lx/d;->j:I

    .line 418
    .line 419
    if-nez v0, :cond_22

    .line 420
    .line 421
    if-eqz v8, :cond_22

    .line 422
    .line 423
    iget v0, v1, Lx/d;->k:I

    .line 424
    .line 425
    if-eqz v0, :cond_20

    .line 426
    .line 427
    goto :goto_1a

    .line 428
    :cond_20
    move/from16 v5, v16

    .line 429
    .line 430
    move v9, v5

    .line 431
    move v11, v9

    .line 432
    :cond_21
    :goto_19
    const/4 v0, -0x1

    .line 433
    goto/16 :goto_21

    .line 434
    .line 435
    :cond_22
    :goto_1a
    instance-of v0, v10, Lz/q;

    .line 436
    .line 437
    if-eqz v0, :cond_23

    .line 438
    .line 439
    instance-of v0, v1, Lx/g;

    .line 440
    .line 441
    if-eqz v0, :cond_23

    .line 442
    .line 443
    move-object v0, v1

    .line 444
    check-cast v0, Lx/g;

    .line 445
    .line 446
    move-object v8, v10

    .line 447
    check-cast v8, Lz/q;

    .line 448
    .line 449
    invoke-virtual {v8, v0, v6, v7}, Lz/q;->i(Lx/g;II)V

    .line 450
    .line 451
    .line 452
    goto :goto_1b

    .line 453
    :cond_23
    invoke-virtual {v10, v6, v7}, Landroid/view/View;->measure(II)V

    .line 454
    .line 455
    .line 456
    :goto_1b
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    if-eqz v5, :cond_24

    .line 469
    .line 470
    aput v0, v14, v16

    .line 471
    .line 472
    const/16 v19, 0x2

    .line 473
    .line 474
    aput v8, v14, v19

    .line 475
    .line 476
    goto :goto_1c

    .line 477
    :cond_24
    const/16 v19, 0x2

    .line 478
    .line 479
    aput v16, v14, v16

    .line 480
    .line 481
    aput v16, v14, v19

    .line 482
    .line 483
    :goto_1c
    if-eqz v9, :cond_25

    .line 484
    .line 485
    aput v8, v14, v20

    .line 486
    .line 487
    const/16 v17, 0x3

    .line 488
    .line 489
    aput v0, v14, v17

    .line 490
    .line 491
    goto :goto_1d

    .line 492
    :cond_25
    const/16 v17, 0x3

    .line 493
    .line 494
    aput v16, v14, v20

    .line 495
    .line 496
    aput v16, v14, v17

    .line 497
    .line 498
    :goto_1d
    iget v5, v1, Lx/d;->m:I

    .line 499
    .line 500
    if-lez v5, :cond_26

    .line 501
    .line 502
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    goto :goto_1e

    .line 507
    :cond_26
    move v5, v0

    .line 508
    :goto_1e
    iget v9, v1, Lx/d;->n:I

    .line 509
    .line 510
    if-lez v9, :cond_27

    .line 511
    .line 512
    invoke-static {v9, v5}, Ljava/lang/Math;->min(II)I

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    :cond_27
    iget v9, v1, Lx/d;->p:I

    .line 517
    .line 518
    if-lez v9, :cond_28

    .line 519
    .line 520
    invoke-static {v9, v8}, Ljava/lang/Math;->max(II)I

    .line 521
    .line 522
    .line 523
    move-result v9

    .line 524
    goto :goto_1f

    .line 525
    :cond_28
    move v9, v8

    .line 526
    :goto_1f
    iget v14, v1, Lx/d;->q:I

    .line 527
    .line 528
    if-lez v14, :cond_29

    .line 529
    .line 530
    invoke-static {v14, v9}, Ljava/lang/Math;->min(II)I

    .line 531
    .line 532
    .line 533
    move-result v9

    .line 534
    :cond_29
    const/high16 v14, 0x3f000000    # 0.5f

    .line 535
    .line 536
    if-eqz v13, :cond_2a

    .line 537
    .line 538
    if-eqz v4, :cond_2a

    .line 539
    .line 540
    iget v3, v1, Lx/d;->L:F

    .line 541
    .line 542
    int-to-float v4, v9

    .line 543
    mul-float/2addr v4, v3

    .line 544
    add-float/2addr v4, v14

    .line 545
    float-to-int v5, v4

    .line 546
    goto :goto_20

    .line 547
    :cond_2a
    if-eqz v12, :cond_2b

    .line 548
    .line 549
    if-eqz v3, :cond_2b

    .line 550
    .line 551
    iget v3, v1, Lx/d;->L:F

    .line 552
    .line 553
    int-to-float v4, v5

    .line 554
    div-float/2addr v4, v3

    .line 555
    add-float/2addr v4, v14

    .line 556
    float-to-int v9, v4

    .line 557
    :cond_2b
    :goto_20
    if-ne v0, v5, :cond_2c

    .line 558
    .line 559
    if-eq v8, v9, :cond_21

    .line 560
    .line 561
    :cond_2c
    const/high16 v11, 0x40000000    # 2.0f

    .line 562
    .line 563
    if-eq v0, v5, :cond_2d

    .line 564
    .line 565
    invoke-static {v5, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 566
    .line 567
    .line 568
    move-result v6

    .line 569
    :cond_2d
    if-eq v8, v9, :cond_2e

    .line 570
    .line 571
    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 572
    .line 573
    .line 574
    move-result v7

    .line 575
    :cond_2e
    invoke-virtual {v10, v6, v7}, Landroid/view/View;->measure(II)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 583
    .line 584
    .line 585
    move-result v9

    .line 586
    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    .line 587
    .line 588
    .line 589
    move-result v11

    .line 590
    goto/16 :goto_19

    .line 591
    .line 592
    :goto_21
    if-eq v11, v0, :cond_2f

    .line 593
    .line 594
    move/from16 v0, v20

    .line 595
    .line 596
    goto :goto_22

    .line 597
    :cond_2f
    move/from16 v0, v16

    .line 598
    .line 599
    :goto_22
    iget v3, v2, Ly/b;->c:I

    .line 600
    .line 601
    if-ne v5, v3, :cond_31

    .line 602
    .line 603
    iget v3, v2, Ly/b;->d:I

    .line 604
    .line 605
    if-eq v9, v3, :cond_30

    .line 606
    .line 607
    goto :goto_23

    .line 608
    :cond_30
    move/from16 v3, v16

    .line 609
    .line 610
    goto :goto_24

    .line 611
    :cond_31
    :goto_23
    move/from16 v3, v20

    .line 612
    .line 613
    :goto_24
    iput-boolean v3, v2, Ly/b;->i:Z

    .line 614
    .line 615
    iget-boolean v3, v15, Lz/e;->X:Z

    .line 616
    .line 617
    if-eqz v3, :cond_32

    .line 618
    .line 619
    move/from16 v0, v20

    .line 620
    .line 621
    :cond_32
    if-eqz v0, :cond_33

    .line 622
    .line 623
    const/4 v3, -0x1

    .line 624
    if-eq v11, v3, :cond_33

    .line 625
    .line 626
    iget v1, v1, Lx/d;->P:I

    .line 627
    .line 628
    if-eq v1, v11, :cond_33

    .line 629
    .line 630
    move/from16 v1, v20

    .line 631
    .line 632
    iput-boolean v1, v2, Ly/b;->i:Z

    .line 633
    .line 634
    :cond_33
    iput v5, v2, Ly/b;->e:I

    .line 635
    .line 636
    iput v9, v2, Ly/b;->f:I

    .line 637
    .line 638
    iput-boolean v0, v2, Ly/b;->h:Z

    .line 639
    .line 640
    iput v11, v2, Ly/b;->g:I

    .line 641
    .line 642
    return-void
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method

.method public b(I)Z
    .locals 8

    .line 1
    const/high16 v0, -0x200000

    .line 2
    .line 3
    and-int v1, p1, v0

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    move v0, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_6

    .line 15
    .line 16
    :cond_1
    ushr-int/lit8 v0, p1, 0x13

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    and-int/2addr v0, v1

    .line 20
    if-ne v0, v3, :cond_2

    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :cond_2
    ushr-int/lit8 v4, p1, 0x11

    .line 25
    .line 26
    and-int/2addr v4, v1

    .line 27
    if-nez v4, :cond_3

    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_3
    ushr-int/lit8 v5, p1, 0xc

    .line 32
    .line 33
    const/16 v6, 0xf

    .line 34
    .line 35
    and-int/2addr v5, v6

    .line 36
    if-eqz v5, :cond_12

    .line 37
    .line 38
    if-ne v5, v6, :cond_4

    .line 39
    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_4
    ushr-int/lit8 v6, p1, 0xa

    .line 43
    .line 44
    and-int/2addr v6, v1

    .line 45
    if-ne v6, v1, :cond_5

    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_5
    iput v0, p0, Ll3/I;->a:I

    .line 50
    .line 51
    sget-object v2, Ll3/a;->m:[Ljava/lang/String;

    .line 52
    .line 53
    rsub-int/lit8 v7, v4, 0x3

    .line 54
    .line 55
    aget-object v2, v2, v7

    .line 56
    .line 57
    iput-object v2, p0, Ll3/I;->g:Ljava/lang/Object;

    .line 58
    .line 59
    sget-object v2, Ll3/a;->n:[I

    .line 60
    .line 61
    aget v2, v2, v6

    .line 62
    .line 63
    iput v2, p0, Ll3/I;->c:I

    .line 64
    .line 65
    const/4 v6, 0x2

    .line 66
    if-ne v0, v6, :cond_6

    .line 67
    .line 68
    div-int/2addr v2, v6

    .line 69
    iput v2, p0, Ll3/I;->c:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_6
    if-nez v0, :cond_7

    .line 73
    .line 74
    div-int/lit8 v2, v2, 0x4

    .line 75
    .line 76
    iput v2, p0, Ll3/I;->c:I

    .line 77
    .line 78
    :cond_7
    :goto_1
    ushr-int/lit8 v2, p1, 0x9

    .line 79
    .line 80
    and-int/2addr v2, v3

    .line 81
    const/16 v7, 0x480

    .line 82
    .line 83
    if-eq v4, v3, :cond_9

    .line 84
    .line 85
    if-eq v4, v6, :cond_b

    .line 86
    .line 87
    if-ne v4, v1, :cond_8

    .line 88
    .line 89
    const/16 v7, 0x180

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_9
    if-ne v0, v1, :cond_a

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_a
    const/16 v7, 0x240

    .line 102
    .line 103
    :cond_b
    :goto_2
    iput v7, p0, Ll3/I;->f:I

    .line 104
    .line 105
    if-ne v4, v1, :cond_d

    .line 106
    .line 107
    if-ne v0, v1, :cond_c

    .line 108
    .line 109
    sget-object v0, Ll3/a;->o:[I

    .line 110
    .line 111
    sub-int/2addr v5, v3

    .line 112
    aget v0, v0, v5

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_c
    sget-object v0, Ll3/a;->p:[I

    .line 116
    .line 117
    sub-int/2addr v5, v3

    .line 118
    aget v0, v0, v5

    .line 119
    .line 120
    :goto_3
    iput v0, p0, Ll3/I;->e:I

    .line 121
    .line 122
    mul-int/lit8 v0, v0, 0xc

    .line 123
    .line 124
    iget v4, p0, Ll3/I;->c:I

    .line 125
    .line 126
    div-int/2addr v0, v4

    .line 127
    add-int/2addr v0, v2

    .line 128
    mul-int/lit8 v0, v0, 0x4

    .line 129
    .line 130
    iput v0, p0, Ll3/I;->b:I

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_d
    const/16 v7, 0x90

    .line 134
    .line 135
    if-ne v0, v1, :cond_f

    .line 136
    .line 137
    if-ne v4, v6, :cond_e

    .line 138
    .line 139
    sget-object v0, Ll3/a;->q:[I

    .line 140
    .line 141
    sub-int/2addr v5, v3

    .line 142
    aget v0, v0, v5

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_e
    sget-object v0, Ll3/a;->r:[I

    .line 146
    .line 147
    sub-int/2addr v5, v3

    .line 148
    aget v0, v0, v5

    .line 149
    .line 150
    :goto_4
    iput v0, p0, Ll3/I;->e:I

    .line 151
    .line 152
    mul-int/2addr v0, v7

    .line 153
    iget v4, p0, Ll3/I;->c:I

    .line 154
    .line 155
    div-int/2addr v0, v4

    .line 156
    add-int/2addr v0, v2

    .line 157
    iput v0, p0, Ll3/I;->b:I

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_f
    sget-object v0, Ll3/a;->s:[I

    .line 161
    .line 162
    sub-int/2addr v5, v3

    .line 163
    aget v0, v0, v5

    .line 164
    .line 165
    iput v0, p0, Ll3/I;->e:I

    .line 166
    .line 167
    if-ne v4, v3, :cond_10

    .line 168
    .line 169
    const/16 v7, 0x48

    .line 170
    .line 171
    :cond_10
    mul-int/2addr v7, v0

    .line 172
    iget v0, p0, Ll3/I;->c:I

    .line 173
    .line 174
    div-int/2addr v7, v0

    .line 175
    add-int/2addr v7, v2

    .line 176
    iput v7, p0, Ll3/I;->b:I

    .line 177
    .line 178
    :goto_5
    shr-int/lit8 p1, p1, 0x6

    .line 179
    .line 180
    and-int/2addr p1, v1

    .line 181
    if-ne p1, v1, :cond_11

    .line 182
    .line 183
    move v6, v3

    .line 184
    :cond_11
    iput v6, p0, Ll3/I;->d:I

    .line 185
    .line 186
    return v3

    .line 187
    :cond_12
    :goto_6
    return v2
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
.end method
