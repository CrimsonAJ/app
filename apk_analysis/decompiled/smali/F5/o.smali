.class public final LF5/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [LF5/w;

    iput-object v1, p0, LF5/o;->b:Ljava/lang/Object;

    .line 3
    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, LF5/o;->c:Ljava/lang/Object;

    .line 4
    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, LF5/o;->d:Ljava/lang/Object;

    .line 5
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, LF5/o;->e:Ljava/lang/Object;

    .line 6
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LF5/o;->f:Ljava/lang/Object;

    .line 7
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LF5/o;->g:Ljava/lang/Object;

    .line 8
    new-instance v1, LF5/w;

    invoke-direct {v1}, LF5/w;-><init>()V

    iput-object v1, p0, LF5/o;->j:Ljava/lang/Object;

    const/4 v1, 0x2

    .line 9
    new-array v2, v1, [F

    iput-object v2, p0, LF5/o;->k:Ljava/lang/Object;

    .line 10
    new-array v1, v1, [F

    iput-object v1, p0, LF5/o;->l:Ljava/lang/Object;

    .line 11
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LF5/o;->h:Ljava/lang/Object;

    .line 12
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LF5/o;->i:Ljava/lang/Object;

    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, LF5/o;->a:Z

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    iget-object v2, p0, LF5/o;->b:Ljava/lang/Object;

    check-cast v2, [LF5/w;

    new-instance v3, LF5/w;

    invoke-direct {v3}, LF5/w;-><init>()V

    aput-object v3, v2, v1

    .line 15
    iget-object v2, p0, LF5/o;->c:Ljava/lang/Object;

    check-cast v2, [Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    .line 16
    iget-object v2, p0, LF5/o;->d:Ljava/lang/Object;

    check-cast v2, [Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lj3/J;Lk3/e;Landroid/os/Handler;Lk3/l;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p4, p0, LF5/o;->b:Ljava/lang/Object;

    .line 19
    iput-object p1, p0, LF5/o;->f:Ljava/lang/Object;

    .line 20
    new-instance p1, LN3/g0;

    invoke-direct {p1}, LN3/g0;-><init>()V

    iput-object p1, p0, LF5/o;->k:Ljava/lang/Object;

    .line 21
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, LF5/o;->d:Ljava/lang/Object;

    .line 22
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LF5/o;->e:Ljava/lang/Object;

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LF5/o;->c:Ljava/lang/Object;

    .line 24
    new-instance p1, LN3/G;

    invoke-direct {p1}, LN3/G;-><init>()V

    iput-object p1, p0, LF5/o;->g:Ljava/lang/Object;

    .line 25
    new-instance p4, Ln3/l;

    invoke-direct {p4}, Ln3/l;-><init>()V

    iput-object p4, p0, LF5/o;->h:Ljava/lang/Object;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LF5/o;->i:Ljava/lang/Object;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LF5/o;->j:Ljava/lang/Object;

    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    new-instance v0, LN3/F;

    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p3, v0, LN3/F;->a:Landroid/os/Handler;

    .line 32
    iput-object p2, v0, LN3/F;->b:Ljava/lang/Object;

    .line 33
    iget-object p1, p1, LN3/G;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    new-instance p1, Ln3/k;

    .line 35
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p3, p1, Ln3/k;->a:Landroid/os/Handler;

    .line 37
    iput-object p2, p1, Ln3/k;->b:Ljava/lang/Object;

    .line 38
    iget-object p2, p4, Ln3/l;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(ILjava/util/ArrayList;LN3/g0;)Lj3/E0;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    iput-object p3, p0, LF5/o;->k:Ljava/lang/Object;

    .line 8
    .line 9
    move p3, p1

    .line 10
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, p1

    .line 15
    if-ge p3, v0, :cond_4

    .line 16
    .line 17
    sub-int v0, p3, p1

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lj3/i0;

    .line 24
    .line 25
    iget-object v1, p0, LF5/o;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-lez p3, :cond_0

    .line 31
    .line 32
    add-int/lit8 v3, p3, -0x1

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lj3/i0;

    .line 39
    .line 40
    iget-object v4, v3, Lj3/i0;->a:LN3/u;

    .line 41
    .line 42
    iget-object v4, v4, LN3/u;->o:LN3/s;

    .line 43
    .line 44
    iget v3, v3, Lj3/i0;->d:I

    .line 45
    .line 46
    iget-object v4, v4, LN3/o;->b:Lj3/E0;

    .line 47
    .line 48
    invoke-virtual {v4}, Lj3/E0;->o()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/2addr v4, v3

    .line 53
    iput v4, v0, Lj3/i0;->d:I

    .line 54
    .line 55
    iput-boolean v2, v0, Lj3/i0;->e:Z

    .line 56
    .line 57
    iget-object v2, v0, Lj3/i0;->c:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    iput v2, v0, Lj3/i0;->d:I

    .line 64
    .line 65
    iput-boolean v2, v0, Lj3/i0;->e:Z

    .line 66
    .line 67
    iget-object v2, v0, Lj3/i0;->c:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    :goto_1
    iget-object v2, v0, Lj3/i0;->a:LN3/u;

    .line 73
    .line 74
    iget-object v2, v2, LN3/u;->o:LN3/s;

    .line 75
    .line 76
    iget-object v2, v2, LN3/o;->b:Lj3/E0;

    .line 77
    .line 78
    invoke-virtual {v2}, Lj3/E0;->o()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    move v3, p3

    .line 83
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v3, v4, :cond_1

    .line 88
    .line 89
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lj3/i0;

    .line 94
    .line 95
    iget v5, v4, Lj3/i0;->d:I

    .line 96
    .line 97
    add-int/2addr v5, v2

    .line 98
    iput v5, v4, Lj3/i0;->d:I

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-virtual {v1, p3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, LF5/o;->e:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v2, v0, Lj3/i0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-boolean v1, p0, LF5/o;->a:Z

    .line 116
    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    invoke-virtual {p0, v0}, LF5/o;->g(Lj3/i0;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, LF5/o;->d:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Ljava/util/IdentityHashMap;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_2

    .line 131
    .line 132
    iget-object v1, p0, LF5/o;->j:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, Ljava/util/HashSet;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_2
    iget-object v1, p0, LF5/o;->i:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Lj3/h0;

    .line 149
    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    iget-object v1, v0, Lj3/h0;->b:Lj3/g0;

    .line 153
    .line 154
    iget-object v0, v0, Lj3/h0;->a:LN3/a;

    .line 155
    .line 156
    invoke-virtual {v0, v1}, LN3/a;->c(LN3/B;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    :goto_3
    add-int/lit8 p3, p3, 0x1

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_4
    invoke-virtual {p0}, LF5/o;->c()Lj3/E0;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1
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

.method public b(LF5/m;FLandroid/graphics/RectF;Lb7/c;Landroid/graphics/Path;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 14
    .line 15
    .line 16
    iget-object v6, v0, LF5/o;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v6, Landroid/graphics/Path;

    .line 19
    .line 20
    invoke-virtual {v6}, Landroid/graphics/Path;->rewind()V

    .line 21
    .line 22
    .line 23
    iget-object v7, v0, LF5/o;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v7, Landroid/graphics/Path;

    .line 26
    .line 27
    invoke-virtual {v7}, Landroid/graphics/Path;->rewind()V

    .line 28
    .line 29
    .line 30
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 31
    .line 32
    invoke-virtual {v7, v3, v8}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 33
    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    :goto_0
    iget-object v10, v0, LF5/o;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v10, [Landroid/graphics/Matrix;

    .line 39
    .line 40
    iget-object v11, v0, LF5/o;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v11, [Landroid/graphics/Matrix;

    .line 43
    .line 44
    iget-object v12, v0, LF5/o;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v12, [LF5/w;

    .line 47
    .line 48
    const/4 v13, 0x1

    .line 49
    const/4 v14, 0x4

    .line 50
    const/4 v15, 0x2

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    iget-object v8, v0, LF5/o;->k:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v8, [F

    .line 56
    .line 57
    if-ge v9, v14, :cond_9

    .line 58
    .line 59
    if-eq v9, v13, :cond_2

    .line 60
    .line 61
    if-eq v9, v15, :cond_1

    .line 62
    .line 63
    const/4 v14, 0x3

    .line 64
    if-eq v9, v14, :cond_0

    .line 65
    .line 66
    iget-object v14, v1, LF5/m;->f:LF5/c;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    iget-object v14, v1, LF5/m;->e:LF5/c;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    iget-object v14, v1, LF5/m;->h:LF5/c;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget-object v14, v1, LF5/m;->g:LF5/c;

    .line 76
    .line 77
    :goto_1
    if-eq v9, v13, :cond_5

    .line 78
    .line 79
    if-eq v9, v15, :cond_4

    .line 80
    .line 81
    const/4 v15, 0x3

    .line 82
    if-eq v9, v15, :cond_3

    .line 83
    .line 84
    iget-object v15, v1, LF5/m;->b:La/a;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    iget-object v15, v1, LF5/m;->a:La/a;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    iget-object v15, v1, LF5/m;->d:La/a;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    iget-object v15, v1, LF5/m;->c:La/a;

    .line 94
    .line 95
    :goto_2
    aget-object v13, v12, v9

    .line 96
    .line 97
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-interface {v14, v3}, LF5/c;->a(Landroid/graphics/RectF;)F

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    invoke-virtual {v15, v13, v2, v14}, La/a;->p(LF5/w;FF)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v13, v9, 0x1

    .line 108
    .line 109
    rem-int/lit8 v14, v13, 0x4

    .line 110
    .line 111
    mul-int/lit8 v14, v14, 0x5a

    .line 112
    .line 113
    int-to-float v14, v14

    .line 114
    aget-object v15, v11, v9

    .line 115
    .line 116
    invoke-virtual {v15}, Landroid/graphics/Matrix;->reset()V

    .line 117
    .line 118
    .line 119
    iget-object v15, v0, LF5/o;->e:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v15, Landroid/graphics/PointF;

    .line 122
    .line 123
    move-object/from16 v19, v10

    .line 124
    .line 125
    const/4 v10, 0x1

    .line 126
    if-eq v9, v10, :cond_8

    .line 127
    .line 128
    const/4 v10, 0x2

    .line 129
    if-eq v9, v10, :cond_7

    .line 130
    .line 131
    const/4 v10, 0x3

    .line 132
    if-eq v9, v10, :cond_6

    .line 133
    .line 134
    iget v10, v3, Landroid/graphics/RectF;->right:F

    .line 135
    .line 136
    move/from16 v17, v9

    .line 137
    .line 138
    iget v9, v3, Landroid/graphics/RectF;->top:F

    .line 139
    .line 140
    invoke-virtual {v15, v10, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    move/from16 v17, v9

    .line 145
    .line 146
    iget v9, v3, Landroid/graphics/RectF;->left:F

    .line 147
    .line 148
    iget v10, v3, Landroid/graphics/RectF;->top:F

    .line 149
    .line 150
    invoke-virtual {v15, v9, v10}, Landroid/graphics/PointF;->set(FF)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    move/from16 v17, v9

    .line 155
    .line 156
    iget v9, v3, Landroid/graphics/RectF;->left:F

    .line 157
    .line 158
    iget v10, v3, Landroid/graphics/RectF;->bottom:F

    .line 159
    .line 160
    invoke-virtual {v15, v9, v10}, Landroid/graphics/PointF;->set(FF)V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_8
    move/from16 v17, v9

    .line 165
    .line 166
    iget v9, v3, Landroid/graphics/RectF;->right:F

    .line 167
    .line 168
    iget v10, v3, Landroid/graphics/RectF;->bottom:F

    .line 169
    .line 170
    invoke-virtual {v15, v9, v10}, Landroid/graphics/PointF;->set(FF)V

    .line 171
    .line 172
    .line 173
    :goto_3
    aget-object v9, v11, v17

    .line 174
    .line 175
    iget v10, v15, Landroid/graphics/PointF;->x:F

    .line 176
    .line 177
    iget v15, v15, Landroid/graphics/PointF;->y:F

    .line 178
    .line 179
    invoke-virtual {v9, v10, v15}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 180
    .line 181
    .line 182
    aget-object v9, v11, v17

    .line 183
    .line 184
    invoke-virtual {v9, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 185
    .line 186
    .line 187
    aget-object v9, v12, v17

    .line 188
    .line 189
    iget v10, v9, LF5/w;->c:F

    .line 190
    .line 191
    aput v10, v8, v16

    .line 192
    .line 193
    iget v9, v9, LF5/w;->d:F

    .line 194
    .line 195
    const/16 v18, 0x1

    .line 196
    .line 197
    aput v9, v8, v18

    .line 198
    .line 199
    aget-object v9, v11, v17

    .line 200
    .line 201
    invoke-virtual {v9, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 202
    .line 203
    .line 204
    aget-object v9, v19, v17

    .line 205
    .line 206
    invoke-virtual {v9}, Landroid/graphics/Matrix;->reset()V

    .line 207
    .line 208
    .line 209
    aget-object v9, v19, v17

    .line 210
    .line 211
    aget v10, v8, v16

    .line 212
    .line 213
    aget v8, v8, v18

    .line 214
    .line 215
    invoke-virtual {v9, v10, v8}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 216
    .line 217
    .line 218
    aget-object v8, v19, v17

    .line 219
    .line 220
    invoke-virtual {v8, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 221
    .line 222
    .line 223
    move v9, v13

    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :cond_9
    move-object/from16 v19, v10

    .line 227
    .line 228
    move/from16 v9, v16

    .line 229
    .line 230
    :goto_4
    if-ge v9, v14, :cond_13

    .line 231
    .line 232
    aget-object v10, v12, v9

    .line 233
    .line 234
    iget v13, v10, LF5/w;->a:F

    .line 235
    .line 236
    aput v13, v8, v16

    .line 237
    .line 238
    iget v10, v10, LF5/w;->b:F

    .line 239
    .line 240
    const/16 v18, 0x1

    .line 241
    .line 242
    aput v10, v8, v18

    .line 243
    .line 244
    aget-object v10, v11, v9

    .line 245
    .line 246
    invoke-virtual {v10, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 247
    .line 248
    .line 249
    if-nez v9, :cond_a

    .line 250
    .line 251
    aget v10, v8, v16

    .line 252
    .line 253
    aget v13, v8, v18

    .line 254
    .line 255
    invoke-virtual {v5, v10, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_a
    aget v10, v8, v16

    .line 260
    .line 261
    aget v13, v8, v18

    .line 262
    .line 263
    invoke-virtual {v5, v10, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 264
    .line 265
    .line 266
    :goto_5
    aget-object v10, v12, v9

    .line 267
    .line 268
    aget-object v13, v11, v9

    .line 269
    .line 270
    invoke-virtual {v10, v13, v5}, LF5/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 271
    .line 272
    .line 273
    if-eqz v4, :cond_b

    .line 274
    .line 275
    aget-object v10, v12, v9

    .line 276
    .line 277
    aget-object v13, v11, v9

    .line 278
    .line 279
    iget-object v15, v4, Lb7/c;->b:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v15, LF5/h;

    .line 282
    .line 283
    iget-object v14, v15, LF5/h;->d:Ljava/util/BitSet;

    .line 284
    .line 285
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move/from16 v3, v16

    .line 289
    .line 290
    invoke-virtual {v14, v9, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 291
    .line 292
    .line 293
    iget v3, v10, LF5/w;->f:F

    .line 294
    .line 295
    invoke-virtual {v10, v3}, LF5/w;->a(F)V

    .line 296
    .line 297
    .line 298
    new-instance v3, Landroid/graphics/Matrix;

    .line 299
    .line 300
    invoke-direct {v3, v13}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 301
    .line 302
    .line 303
    new-instance v13, Ljava/util/ArrayList;

    .line 304
    .line 305
    iget-object v10, v10, LF5/w;->h:Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-direct {v13, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 308
    .line 309
    .line 310
    new-instance v10, LF5/p;

    .line 311
    .line 312
    invoke-direct {v10, v13, v3}, LF5/p;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 313
    .line 314
    .line 315
    iget-object v3, v15, LF5/h;->b:[LF5/v;

    .line 316
    .line 317
    aput-object v10, v3, v9

    .line 318
    .line 319
    :cond_b
    add-int/lit8 v3, v9, 0x1

    .line 320
    .line 321
    rem-int/lit8 v10, v3, 0x4

    .line 322
    .line 323
    aget-object v13, v12, v9

    .line 324
    .line 325
    iget v14, v13, LF5/w;->c:F

    .line 326
    .line 327
    const/16 v16, 0x0

    .line 328
    .line 329
    aput v14, v8, v16

    .line 330
    .line 331
    iget v13, v13, LF5/w;->d:F

    .line 332
    .line 333
    const/16 v18, 0x1

    .line 334
    .line 335
    aput v13, v8, v18

    .line 336
    .line 337
    aget-object v13, v11, v9

    .line 338
    .line 339
    invoke-virtual {v13, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 340
    .line 341
    .line 342
    aget-object v13, v12, v10

    .line 343
    .line 344
    iget v14, v13, LF5/w;->a:F

    .line 345
    .line 346
    iget-object v15, v0, LF5/o;->l:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v15, [F

    .line 349
    .line 350
    const/16 v16, 0x0

    .line 351
    .line 352
    aput v14, v15, v16

    .line 353
    .line 354
    iget v13, v13, LF5/w;->b:F

    .line 355
    .line 356
    const/16 v18, 0x1

    .line 357
    .line 358
    aput v13, v15, v18

    .line 359
    .line 360
    aget-object v13, v11, v10

    .line 361
    .line 362
    invoke-virtual {v13, v15}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 363
    .line 364
    .line 365
    aget v13, v8, v16

    .line 366
    .line 367
    aget v14, v15, v16

    .line 368
    .line 369
    sub-float/2addr v13, v14

    .line 370
    float-to-double v13, v13

    .line 371
    aget v20, v8, v18

    .line 372
    .line 373
    aget v15, v15, v18

    .line 374
    .line 375
    sub-float v15, v20, v15

    .line 376
    .line 377
    move-object/from16 v21, v11

    .line 378
    .line 379
    move-object/from16 v20, v12

    .line 380
    .line 381
    float-to-double v11, v15

    .line 382
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->hypot(DD)D

    .line 383
    .line 384
    .line 385
    move-result-wide v11

    .line 386
    double-to-float v11, v11

    .line 387
    const v12, 0x3a83126f    # 0.001f

    .line 388
    .line 389
    .line 390
    sub-float/2addr v11, v12

    .line 391
    const/4 v12, 0x0

    .line 392
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    aget-object v13, v20, v9

    .line 397
    .line 398
    iget v14, v13, LF5/w;->c:F

    .line 399
    .line 400
    const/16 v16, 0x0

    .line 401
    .line 402
    aput v14, v8, v16

    .line 403
    .line 404
    iget v13, v13, LF5/w;->d:F

    .line 405
    .line 406
    const/4 v14, 0x1

    .line 407
    aput v13, v8, v14

    .line 408
    .line 409
    aget-object v13, v21, v9

    .line 410
    .line 411
    invoke-virtual {v13, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 412
    .line 413
    .line 414
    if-eq v9, v14, :cond_c

    .line 415
    .line 416
    const/4 v15, 0x3

    .line 417
    if-eq v9, v15, :cond_c

    .line 418
    .line 419
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    .line 420
    .line 421
    .line 422
    move-result v13

    .line 423
    aget v15, v8, v14

    .line 424
    .line 425
    sub-float/2addr v13, v15

    .line 426
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 427
    .line 428
    .line 429
    move-result v13

    .line 430
    goto :goto_6

    .line 431
    :cond_c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    .line 432
    .line 433
    .line 434
    move-result v13

    .line 435
    const/16 v16, 0x0

    .line 436
    .line 437
    aget v14, v8, v16

    .line 438
    .line 439
    sub-float/2addr v13, v14

    .line 440
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    :goto_6
    const/high16 v14, 0x43870000    # 270.0f

    .line 445
    .line 446
    iget-object v15, v0, LF5/o;->j:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v15, LF5/w;

    .line 449
    .line 450
    invoke-virtual {v15, v12, v12, v14, v12}, LF5/w;->d(FFFF)V

    .line 451
    .line 452
    .line 453
    const/4 v14, 0x1

    .line 454
    if-eq v9, v14, :cond_f

    .line 455
    .line 456
    const/4 v12, 0x2

    .line 457
    if-eq v9, v12, :cond_e

    .line 458
    .line 459
    const/4 v14, 0x3

    .line 460
    if-eq v9, v14, :cond_d

    .line 461
    .line 462
    iget-object v12, v1, LF5/m;->j:LF5/e;

    .line 463
    .line 464
    goto :goto_7

    .line 465
    :cond_d
    iget-object v12, v1, LF5/m;->i:LF5/e;

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_e
    const/4 v14, 0x3

    .line 469
    iget-object v12, v1, LF5/m;->l:LF5/e;

    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_f
    const/4 v14, 0x3

    .line 473
    iget-object v12, v1, LF5/m;->k:LF5/e;

    .line 474
    .line 475
    :goto_7
    invoke-virtual {v12, v11, v13, v2, v15}, LF5/e;->r(FFFLF5/w;)V

    .line 476
    .line 477
    .line 478
    iget-object v11, v0, LF5/o;->h:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v11, Landroid/graphics/Path;

    .line 481
    .line 482
    invoke-virtual {v11}, Landroid/graphics/Path;->reset()V

    .line 483
    .line 484
    .line 485
    aget-object v13, v19, v9

    .line 486
    .line 487
    invoke-virtual {v15, v13, v11}, LF5/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 488
    .line 489
    .line 490
    iget-boolean v13, v0, LF5/o;->a:Z

    .line 491
    .line 492
    if-eqz v13, :cond_10

    .line 493
    .line 494
    invoke-virtual {v12}, LF5/e;->q()Z

    .line 495
    .line 496
    .line 497
    move-result v12

    .line 498
    if-nez v12, :cond_11

    .line 499
    .line 500
    invoke-virtual {v0, v11, v9}, LF5/o;->f(Landroid/graphics/Path;I)Z

    .line 501
    .line 502
    .line 503
    move-result v12

    .line 504
    if-nez v12, :cond_11

    .line 505
    .line 506
    invoke-virtual {v0, v11, v10}, LF5/o;->f(Landroid/graphics/Path;I)Z

    .line 507
    .line 508
    .line 509
    move-result v10

    .line 510
    if-eqz v10, :cond_10

    .line 511
    .line 512
    goto :goto_8

    .line 513
    :cond_10
    const/16 v18, 0x1

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_11
    :goto_8
    sget-object v10, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 517
    .line 518
    invoke-virtual {v11, v11, v7, v10}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 519
    .line 520
    .line 521
    iget v10, v15, LF5/w;->a:F

    .line 522
    .line 523
    const/16 v16, 0x0

    .line 524
    .line 525
    aput v10, v8, v16

    .line 526
    .line 527
    iget v10, v15, LF5/w;->b:F

    .line 528
    .line 529
    const/16 v18, 0x1

    .line 530
    .line 531
    aput v10, v8, v18

    .line 532
    .line 533
    aget-object v10, v19, v9

    .line 534
    .line 535
    invoke-virtual {v10, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 536
    .line 537
    .line 538
    aget v10, v8, v16

    .line 539
    .line 540
    aget v11, v8, v18

    .line 541
    .line 542
    invoke-virtual {v6, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 543
    .line 544
    .line 545
    aget-object v10, v19, v9

    .line 546
    .line 547
    invoke-virtual {v15, v10, v6}, LF5/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 548
    .line 549
    .line 550
    goto :goto_a

    .line 551
    :goto_9
    aget-object v10, v19, v9

    .line 552
    .line 553
    invoke-virtual {v15, v10, v5}, LF5/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 554
    .line 555
    .line 556
    :goto_a
    if-eqz v4, :cond_12

    .line 557
    .line 558
    aget-object v10, v19, v9

    .line 559
    .line 560
    iget-object v11, v4, Lb7/c;->b:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v11, LF5/h;

    .line 563
    .line 564
    iget-object v12, v11, LF5/h;->d:Ljava/util/BitSet;

    .line 565
    .line 566
    add-int/lit8 v13, v9, 0x4

    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    invoke-virtual {v12, v13, v14}, Ljava/util/BitSet;->set(IZ)V

    .line 570
    .line 571
    .line 572
    iget v12, v15, LF5/w;->f:F

    .line 573
    .line 574
    invoke-virtual {v15, v12}, LF5/w;->a(F)V

    .line 575
    .line 576
    .line 577
    new-instance v12, Landroid/graphics/Matrix;

    .line 578
    .line 579
    invoke-direct {v12, v10}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 580
    .line 581
    .line 582
    new-instance v10, Ljava/util/ArrayList;

    .line 583
    .line 584
    iget-object v13, v15, LF5/w;->h:Ljava/util/ArrayList;

    .line 585
    .line 586
    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 587
    .line 588
    .line 589
    new-instance v13, LF5/p;

    .line 590
    .line 591
    invoke-direct {v13, v10, v12}, LF5/p;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 592
    .line 593
    .line 594
    iget-object v10, v11, LF5/h;->c:[LF5/v;

    .line 595
    .line 596
    aput-object v13, v10, v9

    .line 597
    .line 598
    goto :goto_b

    .line 599
    :cond_12
    const/4 v14, 0x0

    .line 600
    :goto_b
    move v9, v3

    .line 601
    move/from16 v16, v14

    .line 602
    .line 603
    move-object/from16 v12, v20

    .line 604
    .line 605
    move-object/from16 v11, v21

    .line 606
    .line 607
    const/4 v14, 0x4

    .line 608
    move-object/from16 v3, p3

    .line 609
    .line 610
    goto/16 :goto_4

    .line 611
    .line 612
    :cond_13
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v6}, Landroid/graphics/Path;->isEmpty()Z

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    if-nez v1, :cond_14

    .line 623
    .line 624
    sget-object v1, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 625
    .line 626
    invoke-virtual {v5, v6, v1}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 627
    .line 628
    .line 629
    :cond_14
    return-void
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
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
.end method

.method public c()Lj3/E0;
    .locals 4

    .line 1
    iget-object v0, p0, LF5/o;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lj3/E0;->a:Lj3/B0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v1, v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lj3/i0;

    .line 27
    .line 28
    iput v2, v3, Lj3/i0;->d:I

    .line 29
    .line 30
    iget-object v3, v3, Lj3/i0;->a:LN3/u;

    .line 31
    .line 32
    iget-object v3, v3, LN3/u;->o:LN3/s;

    .line 33
    .line 34
    iget-object v3, v3, LN3/o;->b:Lj3/E0;

    .line 35
    .line 36
    invoke-virtual {v3}, Lj3/E0;->o()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v2, v3

    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v1, Lj3/u0;

    .line 45
    .line 46
    iget-object v2, p0, LF5/o;->k:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, LN3/g0;

    .line 49
    .line 50
    invoke-direct {v1, v0, v2}, Lj3/u0;-><init>(Ljava/util/ArrayList;LN3/g0;)V

    .line 51
    .line 52
    .line 53
    return-object v1
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
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, LF5/o;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lj3/i0;

    .line 20
    .line 21
    iget-object v2, v1, Lj3/i0;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, p0, LF5/o;->i:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lj3/h0;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v2, v1, Lj3/h0;->b:Lj3/g0;

    .line 42
    .line 43
    iget-object v1, v1, Lj3/h0;->a:LN3/a;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, LN3/a;->c(LN3/B;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-void
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
.end method

.method public e(Lj3/i0;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lj3/i0;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lj3/i0;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LF5/o;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lj3/h0;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, Lj3/h0;->b:Lj3/g0;

    .line 27
    .line 28
    iget-object v2, v0, Lj3/h0;->a:LN3/a;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, LN3/a;->q(LN3/B;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lj3/h0;->c:Lcom/google/firebase/messaging/s;

    .line 34
    .line 35
    invoke-virtual {v2, v0}, LN3/a;->u(LN3/H;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0}, LN3/a;->t(Ln3/m;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, LF5/o;->j:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
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
.end method

.method public f(Landroid/graphics/Path;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, LF5/o;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LF5/o;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [LF5/w;

    .line 11
    .line 12
    aget-object v1, v1, p2

    .line 13
    .line 14
    iget-object v2, p0, LF5/o;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, [Landroid/graphics/Matrix;

    .line 17
    .line 18
    aget-object p2, v2, p2

    .line 19
    .line 20
    invoke-virtual {v1, p2, v0}, LF5/w;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 33
    .line 34
    .line 35
    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 36
    .line 37
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/high16 v0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    cmpl-float p1, p1, v0

    .line 56
    .line 57
    if-lez p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    cmpl-float p1, p1, v0

    .line 64
    .line 65
    if-lez p1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 p1, 0x0

    .line 69
    return p1

    .line 70
    :cond_1
    :goto_0
    return v1
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
.end method

.method public g(Lj3/i0;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lj3/i0;->a:LN3/u;

    .line 2
    .line 3
    new-instance v1, Lj3/g0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lj3/g0;-><init>(LF5/o;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lcom/google/firebase/messaging/s;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1}, Lcom/google/firebase/messaging/s;-><init>(LF5/o;Lj3/i0;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, LF5/o;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/util/HashMap;

    .line 16
    .line 17
    new-instance v4, Lj3/h0;

    .line 18
    .line 19
    invoke-direct {v4, v0, v1, v2}, Lj3/h0;-><init>(LN3/a;Lj3/g0;Lcom/google/firebase/messaging/s;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget p1, Ll4/y;->a:I

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    new-instance v3, Landroid/os/Handler;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, LN3/a;->c:LN3/G;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v5, LN3/F;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v3, v5, LN3/F;->a:Landroid/os/Handler;

    .line 58
    .line 59
    iput-object v2, v5, LN3/F;->b:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object p1, p1, LN3/G;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 62
    .line 63
    invoke-virtual {p1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_1
    new-instance v3, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, v0, LN3/a;->d:Ln3/l;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v4, Ln3/k;

    .line 88
    .line 89
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v3, v4, Ln3/k;->a:Landroid/os/Handler;

    .line 93
    .line 94
    iput-object v2, v4, Ln3/k;->b:Ljava/lang/Object;

    .line 95
    .line 96
    iget-object p1, p1, Ln3/l;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 97
    .line 98
    invoke-virtual {p1, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, LF5/o;->l:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Lk4/W;

    .line 104
    .line 105
    iget-object v2, p0, LF5/o;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Lk3/l;

    .line 108
    .line 109
    invoke-virtual {v0, v1, p1, v2}, LN3/a;->m(LN3/B;Lk4/W;Lk3/l;)V

    .line 110
    .line 111
    .line 112
    return-void
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
.end method

.method public h(LN3/x;)V
    .locals 3

    .line 1
    iget-object v0, p0, LF5/o;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lj3/i0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Lj3/i0;->a:LN3/u;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, LN3/u;->p(LN3/x;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lj3/i0;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    check-cast p1, LN3/r;

    .line 22
    .line 23
    iget-object p1, p1, LN3/r;->a:LN3/A;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, LF5/o;->d()V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, v1}, LF5/o;->e(Lj3/i0;)V

    .line 38
    .line 39
    .line 40
    return-void
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
.end method

.method public i(II)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    sub-int/2addr p2, v0

    .line 3
    :goto_0
    if-lt p2, p1, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, LF5/o;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lj3/i0;

    .line 14
    .line 15
    iget-object v3, p0, LF5/o;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object v4, v2, Lj3/i0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v3, v2, Lj3/i0;->a:LN3/u;

    .line 25
    .line 26
    iget-object v3, v3, LN3/u;->o:LN3/s;

    .line 27
    .line 28
    iget-object v3, v3, LN3/o;->b:Lj3/E0;

    .line 29
    .line 30
    invoke-virtual {v3}, Lj3/E0;->o()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    neg-int v3, v3

    .line 35
    move v4, p2

    .line 36
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-ge v4, v5, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Lj3/i0;

    .line 47
    .line 48
    iget v6, v5, Lj3/i0;->d:I

    .line 49
    .line 50
    add-int/2addr v6, v3

    .line 51
    iput v6, v5, Lj3/i0;->d:I

    .line 52
    .line 53
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iput-boolean v0, v2, Lj3/i0;->e:Z

    .line 57
    .line 58
    iget-boolean v1, p0, LF5/o;->a:Z

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0, v2}, LF5/o;->e(Lj3/i0;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    add-int/lit8 p2, p2, -0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void
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
.end method
