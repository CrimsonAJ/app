.class public final Ld2/a;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final synthetic u:I

.field public v:Ljava/lang/Object;

.field public final w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LJ1/h1;Lcom/google/firebase/messaging/u;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld2/a;->u:I

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, LM1/o;-><init>(LW/g;)V

    iput-object p1, p0, Ld2/a;->v:Ljava/lang/Object;

    iput-object p2, p0, Ld2/a;->w:Ljava/lang/Object;

    .line 2
    new-instance p2, Le2/i;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Le2/i;-><init>(Ld2/a;I)V

    iget-object v0, p1, LW/g;->k:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    new-instance p2, Le2/i;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Le2/i;-><init>(Ld2/a;I)V

    iget-object p1, p1, LJ1/h1;->w:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public constructor <init>(Ld2/b;LJ1/T0;Ld2/f;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld2/a;->u:I

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Ld2/a;->x:Ljava/lang/Object;

    .line 5
    invoke-direct {p0, p2}, LM1/o;-><init>(LW/g;)V

    .line 6
    iput-object p2, p0, Ld2/a;->w:Ljava/lang/Object;

    .line 7
    new-instance p1, LI5/k;

    const/16 v0, 0xe

    invoke-direct {p1, p0, v0, p3}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p2, p2, LW/g;->k:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)V
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const v1, 0x7f1400b8

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, LF0/r0;->a:Landroid/view/View;

    .line 7
    .line 8
    const-string v3, "imageMovie"

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    iget v6, p0, Ld2/a;->u:I

    .line 13
    .line 14
    packed-switch v6, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 18
    .line 19
    iput-object p1, p0, Ld2/a;->x:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v6, p0, Ld2/a;->v:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, LJ1/h1;

    .line 24
    .line 25
    iget-object v7, v6, LJ1/h1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 26
    .line 27
    invoke-static {v7, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v8, LC1/h;

    .line 39
    .line 40
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-direct {v8, v9}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    iget-object v9, p1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 48
    .line 49
    iput-object v9, v8, LC1/h;->c:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v8, v7}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, LF1/b;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    const v10, 0x7f0700cc

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    int-to-float v9, v9

    .line 68
    invoke-direct {v7, v9}, LF1/b;-><init>(F)V

    .line 69
    .line 70
    .line 71
    new-array v9, v4, [LF1/c;

    .line 72
    .line 73
    aput-object v7, v9, v5

    .line 74
    .line 75
    invoke-static {v9}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    iput-object v7, v8, LC1/h;->e:Ljava/util/List;

    .line 84
    .line 85
    invoke-virtual {v8}, LC1/h;->a()LC1/i;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v3, v7}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 90
    .line 91
    .line 92
    iget-object v3, v6, LJ1/h1;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 93
    .line 94
    iget-object v7, p1, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget v3, p1, Lcom/anilab/domain/model/Movie;->k:I

    .line 104
    .line 105
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    new-array v4, v4, [Ljava/lang/Object;

    .line 110
    .line 111
    aput-object v3, v4, v5

    .line 112
    .line 113
    invoke-virtual {v2, v1, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v2, v6, LJ1/h1;->y:Landroidx/appcompat/widget/AppCompatTextView;

    .line 118
    .line 119
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p1, Lcom/anilab/domain/model/Movie;->s:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v2, v6, LJ1/h1;->z:Landroidx/appcompat/widget/AppCompatTextView;

    .line 125
    .line 126
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_0

    .line 134
    .line 135
    move v1, v5

    .line 136
    goto :goto_0

    .line 137
    :cond_0
    move v1, v0

    .line 138
    :goto_0
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 139
    .line 140
    .line 141
    const-string v1, "imagePin"

    .line 142
    .line 143
    iget-object v2, v6, LJ1/h1;->x:Landroidx/appcompat/widget/AppCompatImageView;

    .line 144
    .line 145
    invoke-static {v2, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-boolean p1, p1, Lcom/anilab/domain/model/Movie;->u:Z

    .line 149
    .line 150
    if-eqz p1, :cond_1

    .line 151
    .line 152
    move v0, v5

    .line 153
    :cond_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_0
    check-cast p1, LH2/i;

    .line 158
    .line 159
    iput-object p1, p0, Ld2/a;->v:Ljava/lang/Object;

    .line 160
    .line 161
    iget-object v6, p0, Ld2/a;->w:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v6, LJ1/T0;

    .line 164
    .line 165
    iget-object v7, v6, LJ1/T0;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 166
    .line 167
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    iget v9, p1, LH2/i;->c:I

    .line 172
    .line 173
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    new-array v10, v4, [Ljava/lang/Object;

    .line 178
    .line 179
    aput-object v9, v10, v5

    .line 180
    .line 181
    invoke-virtual {v8, v1, v10}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v6, LJ1/T0;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 189
    .line 190
    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-object v3, p0, Ld2/a;->x:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v3, Ld2/b;

    .line 196
    .line 197
    iget-object v3, v3, Ld2/b;->e:Lcom/anilab/domain/model/Movie;

    .line 198
    .line 199
    iget-object v3, v3, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-static {v7}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    new-instance v8, LC1/h;

    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-direct {v8, v9}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    iput-object v3, v8, LC1/h;->c:Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {v8, v1}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 221
    .line 222
    .line 223
    new-instance v1, LF1/b;

    .line 224
    .line 225
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    const v3, 0x7f0700b5

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    int-to-float v2, v2

    .line 237
    invoke-direct {v1, v2}, LF1/b;-><init>(F)V

    .line 238
    .line 239
    .line 240
    new-array v2, v4, [LF1/c;

    .line 241
    .line 242
    aput-object v1, v2, v5

    .line 243
    .line 244
    invoke-static {v2}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    iput-object v1, v8, LC1/h;->e:Ljava/util/List;

    .line 253
    .line 254
    invoke-virtual {v8}, LC1/h;->a()LC1/i;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v7, v1}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 259
    .line 260
    .line 261
    const-string v1, "textFiller"

    .line 262
    .line 263
    iget-object v2, v6, LJ1/T0;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 264
    .line 265
    invoke-static {v2, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    iget-boolean p1, p1, LH2/i;->e:Z

    .line 269
    .line 270
    if-eqz p1, :cond_2

    .line 271
    .line 272
    move v0, v5

    .line 273
    :cond_2
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
