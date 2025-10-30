.class public final LQ2/c;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements LQ2/P;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/List;

.field public c:I

.field public d:F

.field public e:LQ2/d;

.field public f:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LQ2/c;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    iput-object p1, p0, LQ2/c;->b:Ljava/util/List;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, LQ2/c;->c:I

    .line 18
    .line 19
    const p1, 0x3d5a511a    # 0.0533f

    .line 20
    .line 21
    .line 22
    iput p1, p0, LQ2/c;->d:F

    .line 23
    .line 24
    sget-object p1, LQ2/d;->g:LQ2/d;

    .line 25
    .line 26
    iput-object p1, p0, LQ2/c;->e:LQ2/d;

    .line 27
    .line 28
    const p1, 0x3da3d70a    # 0.08f

    .line 29
    .line 30
    .line 31
    iput p1, p0, LQ2/c;->f:F

    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final a(Ljava/util/List;LQ2/d;FIF)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ2/c;->b:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, LQ2/c;->e:LQ2/d;

    .line 4
    .line 5
    iput p3, p0, LQ2/c;->d:F

    .line 6
    .line 7
    iput p4, p0, LQ2/c;->c:I

    .line 8
    .line 9
    iput p5, p0, LQ2/c;->f:F

    .line 10
    .line 11
    :goto_0
    iget-object p2, p0, LQ2/c;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-ge p3, p4, :cond_0

    .line 22
    .line 23
    new-instance p3, LQ2/N;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p4

    .line 29
    invoke-direct {p3, p4}, LQ2/N;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 37
    .line 38
    .line 39
    return-void
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
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
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LQ2/c;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1f

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    sub-int/2addr v6, v7

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    sub-int v7, v3, v7

    .line 41
    .line 42
    if-le v7, v5, :cond_2a

    .line 43
    .line 44
    if-gt v6, v4, :cond_1

    .line 45
    .line 46
    goto/16 :goto_1f

    .line 47
    .line 48
    :cond_1
    sub-int v8, v7, v5

    .line 49
    .line 50
    iget v9, v0, LQ2/c;->c:I

    .line 51
    .line 52
    iget v10, v0, LQ2/c;->d:F

    .line 53
    .line 54
    invoke-static {v10, v9, v3, v8}, LZ0/a;->x(FIII)F

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    const/4 v10, 0x0

    .line 59
    cmpg-float v11, v9, v10

    .line 60
    .line 61
    if-gtz v11, :cond_2

    .line 62
    .line 63
    goto/16 :goto_1f

    .line 64
    .line 65
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const/4 v13, 0x0

    .line 70
    :goto_0
    if-ge v13, v11, :cond_2a

    .line 71
    .line 72
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v14

    .line 76
    check-cast v14, LY3/b;

    .line 77
    .line 78
    iget v15, v14, LY3/b;->p:I

    .line 79
    .line 80
    move/from16 v16, v10

    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const v10, -0x800001

    .line 85
    .line 86
    .line 87
    const/high16 v12, -0x80000000

    .line 88
    .line 89
    if-eq v15, v12, :cond_6

    .line 90
    .line 91
    invoke-virtual {v14}, LY3/b;->a()LY3/a;

    .line 92
    .line 93
    .line 94
    move-result-object v15

    .line 95
    iput v10, v15, LY3/a;->h:F

    .line 96
    .line 97
    iput v12, v15, LY3/a;->i:I

    .line 98
    .line 99
    const/4 v12, 0x0

    .line 100
    iput-object v12, v15, LY3/a;->c:Landroid/text/Layout$Alignment;

    .line 101
    .line 102
    iget v12, v14, LY3/b;->f:I

    .line 103
    .line 104
    move/from16 v18, v10

    .line 105
    .line 106
    iget v10, v14, LY3/b;->e:F

    .line 107
    .line 108
    if-nez v12, :cond_3

    .line 109
    .line 110
    sub-float v10, v17, v10

    .line 111
    .line 112
    iput v10, v15, LY3/a;->e:F

    .line 113
    .line 114
    const/4 v10, 0x0

    .line 115
    iput v10, v15, LY3/a;->f:I

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    neg-float v10, v10

    .line 119
    sub-float v10, v10, v17

    .line 120
    .line 121
    iput v10, v15, LY3/a;->e:F

    .line 122
    .line 123
    const/4 v10, 0x1

    .line 124
    iput v10, v15, LY3/a;->f:I

    .line 125
    .line 126
    :goto_1
    iget v10, v14, LY3/b;->g:I

    .line 127
    .line 128
    if-eqz v10, :cond_5

    .line 129
    .line 130
    const/4 v12, 0x2

    .line 131
    if-eq v10, v12, :cond_4

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    const/4 v10, 0x0

    .line 135
    iput v10, v15, LY3/a;->g:I

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    const/4 v12, 0x2

    .line 139
    iput v12, v15, LY3/a;->g:I

    .line 140
    .line 141
    :goto_2
    invoke-virtual {v15}, LY3/a;->a()LY3/b;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    goto :goto_3

    .line 146
    :cond_6
    move/from16 v18, v10

    .line 147
    .line 148
    :goto_3
    iget v10, v14, LY3/b;->n:I

    .line 149
    .line 150
    iget v12, v14, LY3/b;->o:F

    .line 151
    .line 152
    invoke-static {v12, v10, v3, v8}, LZ0/a;->x(FIII)F

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    iget-object v12, v0, LQ2/c;->a:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    check-cast v12, LQ2/N;

    .line 163
    .line 164
    iget-object v15, v0, LQ2/c;->e:LQ2/d;

    .line 165
    .line 166
    move-object/from16 v19, v2

    .line 167
    .line 168
    iget v2, v0, LQ2/c;->f:F

    .line 169
    .line 170
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-object v0, v14, LY3/b;->d:Landroid/graphics/Bitmap;

    .line 174
    .line 175
    move/from16 v20, v3

    .line 176
    .line 177
    if-nez v0, :cond_7

    .line 178
    .line 179
    const/4 v3, 0x1

    .line 180
    :goto_4
    move/from16 v21, v8

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_7
    const/4 v3, 0x0

    .line 184
    goto :goto_4

    .line 185
    :goto_5
    iget-object v8, v14, LY3/b;->a:Ljava/lang/CharSequence;

    .line 186
    .line 187
    if-eqz v3, :cond_a

    .line 188
    .line 189
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v22

    .line 193
    if-eqz v22, :cond_8

    .line 194
    .line 195
    move/from16 v33, v4

    .line 196
    .line 197
    move/from16 v34, v5

    .line 198
    .line 199
    move/from16 v32, v9

    .line 200
    .line 201
    move/from16 v22, v11

    .line 202
    .line 203
    move/from16 v23, v13

    .line 204
    .line 205
    :goto_6
    const/4 v15, 0x0

    .line 206
    goto/16 :goto_1e

    .line 207
    .line 208
    :cond_8
    move/from16 v22, v11

    .line 209
    .line 210
    iget-boolean v11, v14, LY3/b;->l:Z

    .line 211
    .line 212
    if-eqz v11, :cond_9

    .line 213
    .line 214
    iget v11, v14, LY3/b;->m:I

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_9
    iget v11, v15, LQ2/d;->c:I

    .line 218
    .line 219
    :goto_7
    move/from16 v23, v13

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_a
    move/from16 v22, v11

    .line 223
    .line 224
    const/high16 v11, -0x1000000

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :goto_8
    iget-object v13, v12, LQ2/N;->i:Ljava/lang/CharSequence;

    .line 228
    .line 229
    move/from16 v24, v2

    .line 230
    .line 231
    iget-object v2, v12, LQ2/N;->f:Landroid/text/TextPaint;

    .line 232
    .line 233
    move/from16 v25, v10

    .line 234
    .line 235
    iget v10, v14, LY3/b;->k:F

    .line 236
    .line 237
    move/from16 v32, v9

    .line 238
    .line 239
    iget v9, v14, LY3/b;->j:F

    .line 240
    .line 241
    move-object/from16 v26, v2

    .line 242
    .line 243
    iget v2, v14, LY3/b;->i:I

    .line 244
    .line 245
    move/from16 v27, v10

    .line 246
    .line 247
    iget v10, v14, LY3/b;->h:F

    .line 248
    .line 249
    move/from16 v28, v9

    .line 250
    .line 251
    iget v9, v14, LY3/b;->g:I

    .line 252
    .line 253
    move/from16 v29, v2

    .line 254
    .line 255
    iget v2, v14, LY3/b;->f:I

    .line 256
    .line 257
    move/from16 v30, v10

    .line 258
    .line 259
    iget v10, v14, LY3/b;->e:F

    .line 260
    .line 261
    iget-object v14, v14, LY3/b;->b:Landroid/text/Layout$Alignment;

    .line 262
    .line 263
    if-eq v13, v8, :cond_c

    .line 264
    .line 265
    if-eqz v13, :cond_b

    .line 266
    .line 267
    invoke-virtual {v13, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v13

    .line 271
    if-eqz v13, :cond_b

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_b
    move/from16 v31, v9

    .line 275
    .line 276
    goto/16 :goto_a

    .line 277
    .line 278
    :cond_c
    :goto_9
    iget-object v13, v12, LQ2/N;->j:Landroid/text/Layout$Alignment;

    .line 279
    .line 280
    invoke-static {v13, v14}, Ll4/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v13

    .line 284
    if-eqz v13, :cond_b

    .line 285
    .line 286
    iget-object v13, v12, LQ2/N;->k:Landroid/graphics/Bitmap;

    .line 287
    .line 288
    if-ne v13, v0, :cond_b

    .line 289
    .line 290
    iget v13, v12, LQ2/N;->l:F

    .line 291
    .line 292
    cmpl-float v13, v13, v10

    .line 293
    .line 294
    if-nez v13, :cond_b

    .line 295
    .line 296
    iget v13, v12, LQ2/N;->m:I

    .line 297
    .line 298
    if-ne v13, v2, :cond_b

    .line 299
    .line 300
    iget v13, v12, LQ2/N;->n:I

    .line 301
    .line 302
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v13

    .line 306
    move/from16 v31, v9

    .line 307
    .line 308
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v9

    .line 316
    if-eqz v9, :cond_d

    .line 317
    .line 318
    iget v9, v12, LQ2/N;->o:F

    .line 319
    .line 320
    cmpl-float v9, v9, v30

    .line 321
    .line 322
    if-nez v9, :cond_d

    .line 323
    .line 324
    iget v9, v12, LQ2/N;->p:I

    .line 325
    .line 326
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v13

    .line 334
    invoke-virtual {v9, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    if-eqz v9, :cond_d

    .line 339
    .line 340
    iget v9, v12, LQ2/N;->q:F

    .line 341
    .line 342
    cmpl-float v9, v9, v28

    .line 343
    .line 344
    if-nez v9, :cond_d

    .line 345
    .line 346
    iget v9, v12, LQ2/N;->r:F

    .line 347
    .line 348
    cmpl-float v9, v9, v27

    .line 349
    .line 350
    if-nez v9, :cond_d

    .line 351
    .line 352
    iget v9, v12, LQ2/N;->s:I

    .line 353
    .line 354
    iget v13, v15, LQ2/d;->a:I

    .line 355
    .line 356
    if-ne v9, v13, :cond_d

    .line 357
    .line 358
    iget v9, v12, LQ2/N;->t:I

    .line 359
    .line 360
    iget v13, v15, LQ2/d;->b:I

    .line 361
    .line 362
    if-ne v9, v13, :cond_d

    .line 363
    .line 364
    iget v9, v12, LQ2/N;->u:I

    .line 365
    .line 366
    if-ne v9, v11, :cond_d

    .line 367
    .line 368
    iget v9, v12, LQ2/N;->w:I

    .line 369
    .line 370
    iget v13, v15, LQ2/d;->d:I

    .line 371
    .line 372
    if-ne v9, v13, :cond_d

    .line 373
    .line 374
    iget v9, v12, LQ2/N;->v:I

    .line 375
    .line 376
    iget v13, v15, LQ2/d;->e:I

    .line 377
    .line 378
    if-ne v9, v13, :cond_d

    .line 379
    .line 380
    invoke-virtual/range {v26 .. v26}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    iget-object v13, v15, LQ2/d;->f:Landroid/graphics/Typeface;

    .line 385
    .line 386
    invoke-static {v9, v13}, Ll4/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    if-eqz v9, :cond_d

    .line 391
    .line 392
    iget v9, v12, LQ2/N;->x:F

    .line 393
    .line 394
    cmpl-float v9, v9, v32

    .line 395
    .line 396
    if-nez v9, :cond_d

    .line 397
    .line 398
    iget v9, v12, LQ2/N;->y:F

    .line 399
    .line 400
    cmpl-float v9, v9, v25

    .line 401
    .line 402
    if-nez v9, :cond_d

    .line 403
    .line 404
    iget v9, v12, LQ2/N;->z:F

    .line 405
    .line 406
    cmpl-float v9, v9, v24

    .line 407
    .line 408
    if-nez v9, :cond_d

    .line 409
    .line 410
    iget v9, v12, LQ2/N;->A:I

    .line 411
    .line 412
    if-ne v9, v4, :cond_d

    .line 413
    .line 414
    iget v9, v12, LQ2/N;->B:I

    .line 415
    .line 416
    if-ne v9, v5, :cond_d

    .line 417
    .line 418
    iget v9, v12, LQ2/N;->C:I

    .line 419
    .line 420
    if-ne v9, v6, :cond_d

    .line 421
    .line 422
    iget v9, v12, LQ2/N;->D:I

    .line 423
    .line 424
    if-ne v9, v7, :cond_d

    .line 425
    .line 426
    invoke-virtual {v12, v1, v3}, LQ2/N;->a(Landroid/graphics/Canvas;Z)V

    .line 427
    .line 428
    .line 429
    move/from16 v33, v4

    .line 430
    .line 431
    move/from16 v34, v5

    .line 432
    .line 433
    goto/16 :goto_6

    .line 434
    .line 435
    :cond_d
    :goto_a
    iput-object v8, v12, LQ2/N;->i:Ljava/lang/CharSequence;

    .line 436
    .line 437
    iput-object v14, v12, LQ2/N;->j:Landroid/text/Layout$Alignment;

    .line 438
    .line 439
    iput-object v0, v12, LQ2/N;->k:Landroid/graphics/Bitmap;

    .line 440
    .line 441
    iput v10, v12, LQ2/N;->l:F

    .line 442
    .line 443
    iput v2, v12, LQ2/N;->m:I

    .line 444
    .line 445
    move/from16 v0, v31

    .line 446
    .line 447
    iput v0, v12, LQ2/N;->n:I

    .line 448
    .line 449
    move/from16 v0, v30

    .line 450
    .line 451
    iput v0, v12, LQ2/N;->o:F

    .line 452
    .line 453
    move/from16 v0, v29

    .line 454
    .line 455
    iput v0, v12, LQ2/N;->p:I

    .line 456
    .line 457
    move/from16 v0, v28

    .line 458
    .line 459
    iput v0, v12, LQ2/N;->q:F

    .line 460
    .line 461
    move/from16 v0, v27

    .line 462
    .line 463
    iput v0, v12, LQ2/N;->r:F

    .line 464
    .line 465
    iget v0, v15, LQ2/d;->a:I

    .line 466
    .line 467
    iput v0, v12, LQ2/N;->s:I

    .line 468
    .line 469
    iget v0, v15, LQ2/d;->b:I

    .line 470
    .line 471
    iput v0, v12, LQ2/N;->t:I

    .line 472
    .line 473
    iput v11, v12, LQ2/N;->u:I

    .line 474
    .line 475
    iget v0, v15, LQ2/d;->d:I

    .line 476
    .line 477
    iput v0, v12, LQ2/N;->w:I

    .line 478
    .line 479
    iget v0, v15, LQ2/d;->e:I

    .line 480
    .line 481
    iput v0, v12, LQ2/N;->v:I

    .line 482
    .line 483
    iget-object v0, v15, LQ2/d;->f:Landroid/graphics/Typeface;

    .line 484
    .line 485
    move-object/from16 v2, v26

    .line 486
    .line 487
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 488
    .line 489
    .line 490
    move/from16 v0, v32

    .line 491
    .line 492
    iput v0, v12, LQ2/N;->x:F

    .line 493
    .line 494
    move/from16 v8, v25

    .line 495
    .line 496
    iput v8, v12, LQ2/N;->y:F

    .line 497
    .line 498
    move/from16 v8, v24

    .line 499
    .line 500
    iput v8, v12, LQ2/N;->z:F

    .line 501
    .line 502
    iput v4, v12, LQ2/N;->A:I

    .line 503
    .line 504
    iput v5, v12, LQ2/N;->B:I

    .line 505
    .line 506
    iput v6, v12, LQ2/N;->C:I

    .line 507
    .line 508
    iput v7, v12, LQ2/N;->D:I

    .line 509
    .line 510
    if-eqz v3, :cond_24

    .line 511
    .line 512
    iget-object v8, v12, LQ2/N;->i:Ljava/lang/CharSequence;

    .line 513
    .line 514
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    iget-object v8, v12, LQ2/N;->i:Ljava/lang/CharSequence;

    .line 518
    .line 519
    instance-of v9, v8, Landroid/text/SpannableStringBuilder;

    .line 520
    .line 521
    if-eqz v9, :cond_e

    .line 522
    .line 523
    check-cast v8, Landroid/text/SpannableStringBuilder;

    .line 524
    .line 525
    goto :goto_b

    .line 526
    :cond_e
    new-instance v8, Landroid/text/SpannableStringBuilder;

    .line 527
    .line 528
    iget-object v9, v12, LQ2/N;->i:Ljava/lang/CharSequence;

    .line 529
    .line 530
    invoke-direct {v8, v9}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 531
    .line 532
    .line 533
    :goto_b
    iget v9, v12, LQ2/N;->C:I

    .line 534
    .line 535
    iget v10, v12, LQ2/N;->A:I

    .line 536
    .line 537
    sub-int/2addr v9, v10

    .line 538
    iget v10, v12, LQ2/N;->D:I

    .line 539
    .line 540
    iget v11, v12, LQ2/N;->B:I

    .line 541
    .line 542
    sub-int/2addr v10, v11

    .line 543
    iget v11, v12, LQ2/N;->x:F

    .line 544
    .line 545
    invoke-virtual {v2, v11}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 546
    .line 547
    .line 548
    iget v11, v12, LQ2/N;->x:F

    .line 549
    .line 550
    const/high16 v13, 0x3e000000    # 0.125f

    .line 551
    .line 552
    mul-float/2addr v11, v13

    .line 553
    const/high16 v13, 0x3f000000    # 0.5f

    .line 554
    .line 555
    add-float/2addr v11, v13

    .line 556
    float-to-int v11, v11

    .line 557
    mul-int/lit8 v13, v11, 0x2

    .line 558
    .line 559
    sub-int v14, v9, v13

    .line 560
    .line 561
    iget v15, v12, LQ2/N;->q:F

    .line 562
    .line 563
    cmpl-float v24, v15, v18

    .line 564
    .line 565
    if-eqz v24, :cond_f

    .line 566
    .line 567
    int-to-float v14, v14

    .line 568
    mul-float/2addr v14, v15

    .line 569
    float-to-int v14, v14

    .line 570
    :cond_f
    move/from16 v27, v14

    .line 571
    .line 572
    const-string v14, "SubtitlePainter"

    .line 573
    .line 574
    if-gtz v27, :cond_10

    .line 575
    .line 576
    const-string v2, "Skipped drawing subtitle cue (insufficient space)"

    .line 577
    .line 578
    invoke-static {v14, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    move/from16 v32, v0

    .line 582
    .line 583
    move/from16 v33, v4

    .line 584
    .line 585
    move/from16 v34, v5

    .line 586
    .line 587
    :goto_c
    const/4 v15, 0x0

    .line 588
    goto/16 :goto_1d

    .line 589
    .line 590
    :cond_10
    iget v15, v12, LQ2/N;->y:F

    .line 591
    .line 592
    cmpl-float v15, v15, v16

    .line 593
    .line 594
    move/from16 v32, v0

    .line 595
    .line 596
    if-lez v15, :cond_11

    .line 597
    .line 598
    new-instance v15, Landroid/text/style/AbsoluteSizeSpan;

    .line 599
    .line 600
    iget v0, v12, LQ2/N;->y:F

    .line 601
    .line 602
    float-to-int v0, v0

    .line 603
    invoke-direct {v15, v0}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v8}, Landroid/text/SpannableStringBuilder;->length()I

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    move-object/from16 v26, v2

    .line 611
    .line 612
    move/from16 v33, v4

    .line 613
    .line 614
    const/4 v2, 0x0

    .line 615
    const/high16 v4, 0xff0000

    .line 616
    .line 617
    invoke-virtual {v8, v15, v2, v0, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 618
    .line 619
    .line 620
    goto :goto_d

    .line 621
    :cond_11
    move-object/from16 v26, v2

    .line 622
    .line 623
    move/from16 v33, v4

    .line 624
    .line 625
    const/4 v2, 0x0

    .line 626
    :goto_d
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 627
    .line 628
    invoke-direct {v0, v8}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 629
    .line 630
    .line 631
    iget v4, v12, LQ2/N;->w:I

    .line 632
    .line 633
    const/4 v15, 0x1

    .line 634
    if-ne v4, v15, :cond_12

    .line 635
    .line 636
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 637
    .line 638
    .line 639
    move-result v4

    .line 640
    const-class v15, Landroid/text/style/ForegroundColorSpan;

    .line 641
    .line 642
    invoke-virtual {v0, v2, v4, v15}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    check-cast v4, [Landroid/text/style/ForegroundColorSpan;

    .line 647
    .line 648
    array-length v2, v4

    .line 649
    const/4 v15, 0x0

    .line 650
    :goto_e
    if-ge v15, v2, :cond_12

    .line 651
    .line 652
    move/from16 v25, v2

    .line 653
    .line 654
    aget-object v2, v4, v15

    .line 655
    .line 656
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    add-int/lit8 v15, v15, 0x1

    .line 660
    .line 661
    move/from16 v2, v25

    .line 662
    .line 663
    goto :goto_e

    .line 664
    :cond_12
    iget v2, v12, LQ2/N;->t:I

    .line 665
    .line 666
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    if-lez v2, :cond_15

    .line 671
    .line 672
    iget v2, v12, LQ2/N;->w:I

    .line 673
    .line 674
    if-eqz v2, :cond_13

    .line 675
    .line 676
    const/4 v4, 0x2

    .line 677
    if-ne v2, v4, :cond_14

    .line 678
    .line 679
    :cond_13
    move/from16 v34, v5

    .line 680
    .line 681
    const/high16 v5, 0xff0000

    .line 682
    .line 683
    const/4 v15, 0x0

    .line 684
    goto :goto_f

    .line 685
    :cond_14
    new-instance v2, Landroid/text/style/BackgroundColorSpan;

    .line 686
    .line 687
    iget v4, v12, LQ2/N;->t:I

    .line 688
    .line 689
    invoke-direct {v2, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 693
    .line 694
    .line 695
    move-result v4

    .line 696
    move/from16 v34, v5

    .line 697
    .line 698
    const/high16 v5, 0xff0000

    .line 699
    .line 700
    const/4 v15, 0x0

    .line 701
    invoke-virtual {v0, v2, v15, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 702
    .line 703
    .line 704
    goto :goto_10

    .line 705
    :goto_f
    new-instance v2, Landroid/text/style/BackgroundColorSpan;

    .line 706
    .line 707
    iget v4, v12, LQ2/N;->t:I

    .line 708
    .line 709
    invoke-direct {v2, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v8}, Landroid/text/SpannableStringBuilder;->length()I

    .line 713
    .line 714
    .line 715
    move-result v4

    .line 716
    invoke-virtual {v8, v2, v15, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 717
    .line 718
    .line 719
    goto :goto_10

    .line 720
    :cond_15
    move/from16 v34, v5

    .line 721
    .line 722
    :goto_10
    iget-object v2, v12, LQ2/N;->j:Landroid/text/Layout$Alignment;

    .line 723
    .line 724
    if-nez v2, :cond_16

    .line 725
    .line 726
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 727
    .line 728
    :cond_16
    move-object/from16 v28, v2

    .line 729
    .line 730
    new-instance v24, Landroid/text/StaticLayout;

    .line 731
    .line 732
    iget v2, v12, LQ2/N;->e:F

    .line 733
    .line 734
    const/16 v31, 0x1

    .line 735
    .line 736
    iget v4, v12, LQ2/N;->d:F

    .line 737
    .line 738
    move/from16 v30, v2

    .line 739
    .line 740
    move/from16 v29, v4

    .line 741
    .line 742
    move-object/from16 v25, v8

    .line 743
    .line 744
    invoke-direct/range {v24 .. v31}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 745
    .line 746
    .line 747
    move-object/from16 v4, v24

    .line 748
    .line 749
    move/from16 v2, v27

    .line 750
    .line 751
    iput-object v4, v12, LQ2/N;->E:Landroid/text/StaticLayout;

    .line 752
    .line 753
    invoke-virtual {v4}, Landroid/text/Layout;->getHeight()I

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    iget-object v5, v12, LQ2/N;->E:Landroid/text/StaticLayout;

    .line 758
    .line 759
    invoke-virtual {v5}, Landroid/text/StaticLayout;->getLineCount()I

    .line 760
    .line 761
    .line 762
    move-result v5

    .line 763
    const/4 v8, 0x0

    .line 764
    const/4 v15, 0x0

    .line 765
    :goto_11
    if-ge v8, v5, :cond_17

    .line 766
    .line 767
    move-object/from16 v35, v0

    .line 768
    .line 769
    iget-object v0, v12, LQ2/N;->E:Landroid/text/StaticLayout;

    .line 770
    .line 771
    invoke-virtual {v0, v8}, Landroid/text/Layout;->getLineWidth(I)F

    .line 772
    .line 773
    .line 774
    move-result v0

    .line 775
    move/from16 v24, v4

    .line 776
    .line 777
    move/from16 v27, v5

    .line 778
    .line 779
    float-to-double v4, v0

    .line 780
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 781
    .line 782
    .line 783
    move-result-wide v4

    .line 784
    double-to-int v0, v4

    .line 785
    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    .line 786
    .line 787
    .line 788
    move-result v15

    .line 789
    add-int/lit8 v8, v8, 0x1

    .line 790
    .line 791
    move/from16 v4, v24

    .line 792
    .line 793
    move/from16 v5, v27

    .line 794
    .line 795
    move-object/from16 v0, v35

    .line 796
    .line 797
    goto :goto_11

    .line 798
    :cond_17
    move-object/from16 v35, v0

    .line 799
    .line 800
    move/from16 v24, v4

    .line 801
    .line 802
    iget v0, v12, LQ2/N;->q:F

    .line 803
    .line 804
    cmpl-float v0, v0, v18

    .line 805
    .line 806
    if-eqz v0, :cond_18

    .line 807
    .line 808
    if-ge v15, v2, :cond_18

    .line 809
    .line 810
    move/from16 v27, v2

    .line 811
    .line 812
    goto :goto_12

    .line 813
    :cond_18
    move/from16 v27, v15

    .line 814
    .line 815
    :goto_12
    add-int v27, v27, v13

    .line 816
    .line 817
    iget v0, v12, LQ2/N;->o:F

    .line 818
    .line 819
    cmpl-float v2, v0, v18

    .line 820
    .line 821
    if-eqz v2, :cond_1b

    .line 822
    .line 823
    int-to-float v2, v9

    .line 824
    mul-float/2addr v2, v0

    .line 825
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 826
    .line 827
    .line 828
    move-result v0

    .line 829
    iget v2, v12, LQ2/N;->A:I

    .line 830
    .line 831
    add-int/2addr v0, v2

    .line 832
    iget v4, v12, LQ2/N;->p:I

    .line 833
    .line 834
    const/4 v15, 0x1

    .line 835
    if-eq v4, v15, :cond_1a

    .line 836
    .line 837
    const/4 v5, 0x2

    .line 838
    if-eq v4, v5, :cond_19

    .line 839
    .line 840
    goto :goto_13

    .line 841
    :cond_19
    sub-int v0, v0, v27

    .line 842
    .line 843
    goto :goto_13

    .line 844
    :cond_1a
    const/4 v5, 0x2

    .line 845
    mul-int/lit8 v0, v0, 0x2

    .line 846
    .line 847
    sub-int v0, v0, v27

    .line 848
    .line 849
    div-int/2addr v0, v5

    .line 850
    :goto_13
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    add-int v2, v0, v27

    .line 855
    .line 856
    iget v4, v12, LQ2/N;->C:I

    .line 857
    .line 858
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 859
    .line 860
    .line 861
    move-result v2

    .line 862
    goto :goto_14

    .line 863
    :cond_1b
    const/4 v5, 0x2

    .line 864
    sub-int v9, v9, v27

    .line 865
    .line 866
    div-int/2addr v9, v5

    .line 867
    iget v0, v12, LQ2/N;->A:I

    .line 868
    .line 869
    add-int/2addr v0, v9

    .line 870
    add-int v2, v0, v27

    .line 871
    .line 872
    :goto_14
    sub-int v27, v2, v0

    .line 873
    .line 874
    if-gtz v27, :cond_1c

    .line 875
    .line 876
    const-string v0, "Skipped drawing subtitle cue (invalid horizontal positioning)"

    .line 877
    .line 878
    invoke-static {v14, v0}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    goto/16 :goto_c

    .line 882
    .line 883
    :cond_1c
    iget v2, v12, LQ2/N;->l:F

    .line 884
    .line 885
    cmpl-float v4, v2, v18

    .line 886
    .line 887
    if-eqz v4, :cond_22

    .line 888
    .line 889
    iget v4, v12, LQ2/N;->m:I

    .line 890
    .line 891
    if-nez v4, :cond_1f

    .line 892
    .line 893
    int-to-float v4, v10

    .line 894
    mul-float/2addr v4, v2

    .line 895
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 896
    .line 897
    .line 898
    move-result v2

    .line 899
    iget v4, v12, LQ2/N;->B:I

    .line 900
    .line 901
    add-int/2addr v2, v4

    .line 902
    iget v4, v12, LQ2/N;->n:I

    .line 903
    .line 904
    const/4 v5, 0x2

    .line 905
    if-ne v4, v5, :cond_1d

    .line 906
    .line 907
    sub-int v2, v2, v24

    .line 908
    .line 909
    goto :goto_15

    .line 910
    :cond_1d
    const/4 v15, 0x1

    .line 911
    if-ne v4, v15, :cond_1e

    .line 912
    .line 913
    mul-int/lit8 v2, v2, 0x2

    .line 914
    .line 915
    sub-int v2, v2, v24

    .line 916
    .line 917
    div-int/2addr v2, v5

    .line 918
    :cond_1e
    :goto_15
    const/4 v15, 0x0

    .line 919
    goto :goto_16

    .line 920
    :cond_1f
    iget-object v2, v12, LQ2/N;->E:Landroid/text/StaticLayout;

    .line 921
    .line 922
    const/4 v15, 0x0

    .line 923
    invoke-virtual {v2, v15}, Landroid/text/Layout;->getLineBottom(I)I

    .line 924
    .line 925
    .line 926
    move-result v2

    .line 927
    iget-object v4, v12, LQ2/N;->E:Landroid/text/StaticLayout;

    .line 928
    .line 929
    invoke-virtual {v4, v15}, Landroid/text/StaticLayout;->getLineTop(I)I

    .line 930
    .line 931
    .line 932
    move-result v4

    .line 933
    sub-int/2addr v2, v4

    .line 934
    iget v4, v12, LQ2/N;->l:F

    .line 935
    .line 936
    cmpl-float v5, v4, v16

    .line 937
    .line 938
    if-ltz v5, :cond_20

    .line 939
    .line 940
    int-to-float v2, v2

    .line 941
    mul-float/2addr v4, v2

    .line 942
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 943
    .line 944
    .line 945
    move-result v2

    .line 946
    iget v4, v12, LQ2/N;->B:I

    .line 947
    .line 948
    add-int/2addr v2, v4

    .line 949
    goto :goto_16

    .line 950
    :cond_20
    add-float v4, v4, v17

    .line 951
    .line 952
    int-to-float v2, v2

    .line 953
    mul-float/2addr v4, v2

    .line 954
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 955
    .line 956
    .line 957
    move-result v2

    .line 958
    iget v4, v12, LQ2/N;->D:I

    .line 959
    .line 960
    add-int/2addr v2, v4

    .line 961
    sub-int v2, v2, v24

    .line 962
    .line 963
    :goto_16
    add-int v4, v2, v24

    .line 964
    .line 965
    iget v5, v12, LQ2/N;->D:I

    .line 966
    .line 967
    if-le v4, v5, :cond_21

    .line 968
    .line 969
    sub-int v2, v5, v24

    .line 970
    .line 971
    goto :goto_17

    .line 972
    :cond_21
    iget v4, v12, LQ2/N;->B:I

    .line 973
    .line 974
    if-ge v2, v4, :cond_23

    .line 975
    .line 976
    move v2, v4

    .line 977
    goto :goto_17

    .line 978
    :cond_22
    const/4 v15, 0x0

    .line 979
    iget v2, v12, LQ2/N;->D:I

    .line 980
    .line 981
    sub-int v2, v2, v24

    .line 982
    .line 983
    int-to-float v4, v10

    .line 984
    iget v5, v12, LQ2/N;->z:F

    .line 985
    .line 986
    mul-float/2addr v4, v5

    .line 987
    float-to-int v4, v4

    .line 988
    sub-int/2addr v2, v4

    .line 989
    :cond_23
    :goto_17
    new-instance v24, Landroid/text/StaticLayout;

    .line 990
    .line 991
    iget v4, v12, LQ2/N;->e:F

    .line 992
    .line 993
    const/16 v31, 0x1

    .line 994
    .line 995
    iget v5, v12, LQ2/N;->d:F

    .line 996
    .line 997
    move/from16 v30, v4

    .line 998
    .line 999
    move/from16 v29, v5

    .line 1000
    .line 1001
    invoke-direct/range {v24 .. v31}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 1002
    .line 1003
    .line 1004
    move-object/from16 v4, v24

    .line 1005
    .line 1006
    iput-object v4, v12, LQ2/N;->E:Landroid/text/StaticLayout;

    .line 1007
    .line 1008
    new-instance v24, Landroid/text/StaticLayout;

    .line 1009
    .line 1010
    iget v4, v12, LQ2/N;->e:F

    .line 1011
    .line 1012
    iget v5, v12, LQ2/N;->d:F

    .line 1013
    .line 1014
    move/from16 v30, v4

    .line 1015
    .line 1016
    move/from16 v29, v5

    .line 1017
    .line 1018
    move-object/from16 v25, v35

    .line 1019
    .line 1020
    invoke-direct/range {v24 .. v31}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 1021
    .line 1022
    .line 1023
    move-object/from16 v4, v24

    .line 1024
    .line 1025
    iput-object v4, v12, LQ2/N;->F:Landroid/text/StaticLayout;

    .line 1026
    .line 1027
    iput v0, v12, LQ2/N;->G:I

    .line 1028
    .line 1029
    iput v2, v12, LQ2/N;->H:I

    .line 1030
    .line 1031
    iput v11, v12, LQ2/N;->I:I

    .line 1032
    .line 1033
    goto/16 :goto_1d

    .line 1034
    .line 1035
    :cond_24
    move/from16 v32, v0

    .line 1036
    .line 1037
    move/from16 v33, v4

    .line 1038
    .line 1039
    move/from16 v34, v5

    .line 1040
    .line 1041
    const/4 v15, 0x0

    .line 1042
    iget-object v0, v12, LQ2/N;->k:Landroid/graphics/Bitmap;

    .line 1043
    .line 1044
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1045
    .line 1046
    .line 1047
    iget-object v0, v12, LQ2/N;->k:Landroid/graphics/Bitmap;

    .line 1048
    .line 1049
    iget v2, v12, LQ2/N;->C:I

    .line 1050
    .line 1051
    iget v4, v12, LQ2/N;->A:I

    .line 1052
    .line 1053
    sub-int/2addr v2, v4

    .line 1054
    iget v5, v12, LQ2/N;->D:I

    .line 1055
    .line 1056
    iget v8, v12, LQ2/N;->B:I

    .line 1057
    .line 1058
    sub-int/2addr v5, v8

    .line 1059
    int-to-float v4, v4

    .line 1060
    int-to-float v2, v2

    .line 1061
    iget v9, v12, LQ2/N;->o:F

    .line 1062
    .line 1063
    mul-float/2addr v9, v2

    .line 1064
    add-float/2addr v9, v4

    .line 1065
    int-to-float v4, v8

    .line 1066
    int-to-float v5, v5

    .line 1067
    iget v8, v12, LQ2/N;->l:F

    .line 1068
    .line 1069
    mul-float/2addr v8, v5

    .line 1070
    add-float/2addr v8, v4

    .line 1071
    iget v4, v12, LQ2/N;->q:F

    .line 1072
    .line 1073
    mul-float/2addr v2, v4

    .line 1074
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 1075
    .line 1076
    .line 1077
    move-result v2

    .line 1078
    iget v4, v12, LQ2/N;->r:F

    .line 1079
    .line 1080
    cmpl-float v10, v4, v18

    .line 1081
    .line 1082
    if-eqz v10, :cond_25

    .line 1083
    .line 1084
    mul-float/2addr v5, v4

    .line 1085
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 1086
    .line 1087
    .line 1088
    move-result v0

    .line 1089
    goto :goto_18

    .line 1090
    :cond_25
    int-to-float v4, v2

    .line 1091
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1092
    .line 1093
    .line 1094
    move-result v5

    .line 1095
    int-to-float v5, v5

    .line 1096
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1097
    .line 1098
    .line 1099
    move-result v0

    .line 1100
    int-to-float v0, v0

    .line 1101
    div-float/2addr v5, v0

    .line 1102
    mul-float/2addr v5, v4

    .line 1103
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 1104
    .line 1105
    .line 1106
    move-result v0

    .line 1107
    :goto_18
    iget v4, v12, LQ2/N;->p:I

    .line 1108
    .line 1109
    const/4 v5, 0x2

    .line 1110
    if-ne v4, v5, :cond_26

    .line 1111
    .line 1112
    int-to-float v4, v2

    .line 1113
    :goto_19
    sub-float/2addr v9, v4

    .line 1114
    goto :goto_1a

    .line 1115
    :cond_26
    const/4 v10, 0x1

    .line 1116
    if-ne v4, v10, :cond_27

    .line 1117
    .line 1118
    div-int/lit8 v4, v2, 0x2

    .line 1119
    .line 1120
    int-to-float v4, v4

    .line 1121
    goto :goto_19

    .line 1122
    :cond_27
    :goto_1a
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 1123
    .line 1124
    .line 1125
    move-result v4

    .line 1126
    iget v5, v12, LQ2/N;->n:I

    .line 1127
    .line 1128
    const/4 v9, 0x2

    .line 1129
    if-ne v5, v9, :cond_28

    .line 1130
    .line 1131
    int-to-float v5, v0

    .line 1132
    :goto_1b
    sub-float/2addr v8, v5

    .line 1133
    goto :goto_1c

    .line 1134
    :cond_28
    const/4 v10, 0x1

    .line 1135
    if-ne v5, v10, :cond_29

    .line 1136
    .line 1137
    div-int/lit8 v5, v0, 0x2

    .line 1138
    .line 1139
    int-to-float v5, v5

    .line 1140
    goto :goto_1b

    .line 1141
    :cond_29
    :goto_1c
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 1142
    .line 1143
    .line 1144
    move-result v5

    .line 1145
    new-instance v8, Landroid/graphics/Rect;

    .line 1146
    .line 1147
    add-int/2addr v2, v4

    .line 1148
    add-int/2addr v0, v5

    .line 1149
    invoke-direct {v8, v4, v5, v2, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1150
    .line 1151
    .line 1152
    iput-object v8, v12, LQ2/N;->J:Landroid/graphics/Rect;

    .line 1153
    .line 1154
    :goto_1d
    invoke-virtual {v12, v1, v3}, LQ2/N;->a(Landroid/graphics/Canvas;Z)V

    .line 1155
    .line 1156
    .line 1157
    :goto_1e
    add-int/lit8 v13, v23, 0x1

    .line 1158
    .line 1159
    move-object/from16 v0, p0

    .line 1160
    .line 1161
    move/from16 v10, v16

    .line 1162
    .line 1163
    move-object/from16 v2, v19

    .line 1164
    .line 1165
    move/from16 v3, v20

    .line 1166
    .line 1167
    move/from16 v8, v21

    .line 1168
    .line 1169
    move/from16 v11, v22

    .line 1170
    .line 1171
    move/from16 v9, v32

    .line 1172
    .line 1173
    move/from16 v4, v33

    .line 1174
    .line 1175
    move/from16 v5, v34

    .line 1176
    .line 1177
    goto/16 :goto_0

    .line 1178
    .line 1179
    :cond_2a
    :goto_1f
    return-void
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
.end method
