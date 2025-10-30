.class public final La8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY7/I0;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:LY7/h;

.field public final synthetic c:La8/e;


# direct methods
.method public constructor <init>(La8/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La8/b;->c:La8/e;

    .line 5
    .line 6
    sget-object p1, La8/g;->p:LG6/a;

    .line 7
    .line 8
    iput-object p1, p0, La8/b;->a:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
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
.method public final a(Ld8/u;I)V
    .locals 1

    .line 1
    iget-object v0, p0, La8/b;->b:LY7/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LY7/h;->a(Ld8/u;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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

.method public final b(Lb8/g;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, La8/e;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    iget-object v6, p0, La8/b;->c:La8/e;

    .line 4
    .line 5
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La8/m;

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v6}, La8/e;->v()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    sget-object v0, La8/g;->l:LG6/a;

    .line 18
    .line 19
    iput-object v0, p0, La8/b;->a:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v6}, La8/e;->p()Ljava/lang/Throwable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    sget v1, Ld8/v;->a:I

    .line 31
    .line 32
    throw v0

    .line 33
    :cond_1
    sget-object v1, La8/e;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 34
    .line 35
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    sget v1, La8/g;->b:I

    .line 40
    .line 41
    int-to-long v1, v1

    .line 42
    div-long v7, v3, v1

    .line 43
    .line 44
    rem-long v1, v3, v1

    .line 45
    .line 46
    long-to-int v2, v1

    .line 47
    iget-wide v9, v0, Ld8/u;->c:J

    .line 48
    .line 49
    cmp-long v1, v9, v7

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v6, v7, v8, v0}, La8/e;->o(JLa8/m;)La8/m;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v1, v0

    .line 61
    :cond_3
    const/4 v11, 0x0

    .line 62
    move-object v7, v1

    .line 63
    move v8, v2

    .line 64
    move-wide v9, v3

    .line 65
    invoke-virtual/range {v6 .. v11}, La8/e;->F(La8/m;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v7, La8/g;->m:LG6/a;

    .line 70
    .line 71
    if-eq v0, v7, :cond_12

    .line 72
    .line 73
    sget-object v8, La8/g;->o:LG6/a;

    .line 74
    .line 75
    if-ne v0, v8, :cond_5

    .line 76
    .line 77
    invoke-virtual {v6}, La8/e;->s()J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    cmp-long v0, v3, v7

    .line 82
    .line 83
    if-gez v0, :cond_4

    .line 84
    .line 85
    invoke-virtual {v1}, Ld8/d;->a()V

    .line 86
    .line 87
    .line 88
    :cond_4
    move-object v0, v1

    .line 89
    goto :goto_0

    .line 90
    :cond_5
    sget-object v9, La8/g;->n:LG6/a;

    .line 91
    .line 92
    if-ne v0, v9, :cond_11

    .line 93
    .line 94
    iget-object v0, p0, La8/b;->c:La8/e;

    .line 95
    .line 96
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/D1;->A(LE7/d;)LE7/d;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    invoke-static {v9}, LY7/B;->n(LE7/d;)LY7/h;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    :try_start_0
    iput-object v9, p0, La8/b;->b:LY7/h;

    .line 105
    .line 106
    move-object v5, p0

    .line 107
    invoke-virtual/range {v0 .. v5}, La8/e;->F(La8/m;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    if-ne v10, v7, :cond_6

    .line 112
    .line 113
    invoke-virtual {p0, v1, v2}, La8/b;->a(Ld8/u;I)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    :cond_6
    const/4 v7, 0x0

    .line 119
    if-ne v10, v8, :cond_10

    .line 120
    .line 121
    invoke-virtual {v0}, La8/e;->s()J

    .line 122
    .line 123
    .line 124
    move-result-wide v10

    .line 125
    cmp-long v2, v3, v10

    .line 126
    .line 127
    if-gez v2, :cond_7

    .line 128
    .line 129
    invoke-virtual {v1}, Ld8/d;->a()V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    goto/16 :goto_5

    .line 135
    .line 136
    :cond_7
    :goto_1
    sget-object v1, La8/e;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 137
    .line 138
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, La8/m;

    .line 143
    .line 144
    :cond_8
    :goto_2
    invoke-virtual {v0}, La8/e;->v()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_a

    .line 149
    .line 150
    iget-object v0, p0, La8/b;->b:LY7/h;

    .line 151
    .line 152
    invoke-static {v0}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iput-object v7, p0, La8/b;->b:LY7/h;

    .line 156
    .line 157
    sget-object v1, La8/g;->l:LG6/a;

    .line 158
    .line 159
    iput-object v1, p0, La8/b;->a:Ljava/lang/Object;

    .line 160
    .line 161
    invoke-virtual {v6}, La8/e;->p()Ljava/lang/Throwable;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    if-nez v1, :cond_9

    .line 166
    .line 167
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, LY7/h;->resumeWith(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_9
    invoke-static {v1}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v0, v1}, LY7/h;->resumeWith(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_a
    sget-object v2, La8/e;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 182
    .line 183
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 184
    .line 185
    .line 186
    move-result-wide v3

    .line 187
    sget v2, La8/g;->b:I

    .line 188
    .line 189
    int-to-long v10, v2

    .line 190
    div-long v12, v3, v10

    .line 191
    .line 192
    rem-long v10, v3, v10

    .line 193
    .line 194
    long-to-int v2, v10

    .line 195
    iget-wide v10, v1, Ld8/u;->c:J

    .line 196
    .line 197
    cmp-long v8, v10, v12

    .line 198
    .line 199
    if-eqz v8, :cond_c

    .line 200
    .line 201
    invoke-virtual {v0, v12, v13, v1}, La8/e;->o(JLa8/m;)La8/m;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    if-nez v8, :cond_b

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_b
    move-object v1, v8

    .line 209
    :cond_c
    move-object v5, p0

    .line 210
    invoke-virtual/range {v0 .. v5}, La8/e;->F(La8/m;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    sget-object v10, La8/g;->m:LG6/a;

    .line 215
    .line 216
    if-ne v8, v10, :cond_d

    .line 217
    .line 218
    invoke-virtual {p0, v1, v2}, La8/b;->a(Ld8/u;I)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_d
    sget-object v2, La8/g;->o:LG6/a;

    .line 223
    .line 224
    if-ne v8, v2, :cond_e

    .line 225
    .line 226
    invoke-virtual {v0}, La8/e;->s()J

    .line 227
    .line 228
    .line 229
    move-result-wide v10

    .line 230
    cmp-long v2, v3, v10

    .line 231
    .line 232
    if-gez v2, :cond_8

    .line 233
    .line 234
    invoke-virtual {v1}, Ld8/d;->a()V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_e
    sget-object v0, La8/g;->n:LG6/a;

    .line 239
    .line 240
    if-eq v8, v0, :cond_f

    .line 241
    .line 242
    invoke-virtual {v1}, Ld8/d;->a()V

    .line 243
    .line 244
    .line 245
    iput-object v8, p0, La8/b;->a:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v7, p0, La8/b;->b:LY7/h;

    .line 248
    .line 249
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 250
    .line 251
    :goto_3
    invoke-virtual {v9, v0, v7}, LY7/h;->b(Ljava/lang/Object;LO7/l;)V

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 256
    .line 257
    const-string v1, "unexpected"

    .line 258
    .line 259
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_10
    invoke-virtual {v1}, Ld8/d;->a()V

    .line 264
    .line 265
    .line 266
    iput-object v10, p0, La8/b;->a:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v7, p0, La8/b;->b:LY7/h;

    .line 269
    .line 270
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :goto_4
    invoke-virtual {v9}, LY7/h;->r()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    return-object v0

    .line 278
    :goto_5
    invoke-virtual {v9}, LY7/h;->z()V

    .line 279
    .line 280
    .line 281
    throw v0

    .line 282
    :cond_11
    invoke-virtual {v1}, Ld8/d;->a()V

    .line 283
    .line 284
    .line 285
    iput-object v0, p0, La8/b;->a:Ljava/lang/Object;

    .line 286
    .line 287
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 288
    .line 289
    return-object v0

    .line 290
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 291
    .line 292
    const-string v1, "unreachable"

    .line 293
    .line 294
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v0
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
.end method
