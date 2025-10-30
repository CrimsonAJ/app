.class public final synthetic Lt1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb5/G1;


# direct methods
.method public synthetic constructor <init>(Lb5/G1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt1/d;->a:I

    iput-object p1, p0, Lt1/d;->b:Lb5/G1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, Lt1/d;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lt1/d;->b:Lb5/G1;

    .line 8
    .line 9
    sget-object v1, LH1/l;->a:LH1/l;

    .line 10
    .line 11
    iget-object v0, v0, Lb5/G1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/Context;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    sget-object v2, LH1/l;->b:Lv1/h;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    new-instance v2, Lv1/a;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v3, Lx8/n;->a:Lx8/u;

    .line 26
    .line 27
    iput-object v3, v2, Lv1/a;->b:Lx8/u;

    .line 28
    .line 29
    const-wide v3, 0x3f947ae147ae147bL    # 0.02

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    iput-wide v3, v2, Lv1/a;->c:D

    .line 35
    .line 36
    const-wide/32 v3, 0xa00000

    .line 37
    .line 38
    .line 39
    iput-wide v3, v2, Lv1/a;->d:J

    .line 40
    .line 41
    const-wide/32 v3, 0xfa00000

    .line 42
    .line 43
    .line 44
    iput-wide v3, v2, Lv1/a;->e:J

    .line 45
    .line 46
    sget-object v3, LY7/K;->b:Lf8/d;

    .line 47
    .line 48
    iput-object v3, v2, Lv1/a;->f:Lf8/d;

    .line 49
    .line 50
    sget-object v3, LH1/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, LL7/a;->K(Ljava/io/File;)Ljava/io/File;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v3, Lx8/y;->b:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0}, Ld0/o;->h(Ljava/io/File;)Lx8/y;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, v2, Lv1/a;->a:Lx8/y;

    .line 72
    .line 73
    invoke-virtual {v2}, Lv1/a;->a()Lv1/h;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sput-object v2, LH1/l;->b:Lv1/h;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto :goto_1

    .line 82
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    const-string v2, "cacheDir == null"

    .line 85
    .line 86
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :cond_1
    :goto_0
    monitor-exit v1

    .line 91
    return-object v2

    .line 92
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw v0

    .line 94
    :pswitch_0
    const-class v1, Landroid/app/ActivityManager;

    .line 95
    .line 96
    iget-object v2, p0, Lt1/d;->b:Lb5/G1;

    .line 97
    .line 98
    iget-object v2, v2, Lb5/G1;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Landroid/content/Context;

    .line 101
    .line 102
    sget-object v3, LH1/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 103
    .line 104
    const-wide v3, 0x3fc999999999999aL    # 0.2

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    :try_start_2
    invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-static {v5}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    check-cast v5, Landroid/app/ActivityManager;

    .line 117
    .line 118
    invoke-virtual {v5}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 119
    .line 120
    .line 121
    move-result v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 122
    if-eqz v5, :cond_2

    .line 123
    .line 124
    const-wide v3, 0x3fc3333333333333L    # 0.15

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :catch_0
    :cond_2
    new-instance v5, LA1/i;

    .line 130
    .line 131
    invoke-direct {v5, v0}, LA1/i;-><init>(I)V

    .line 132
    .line 133
    .line 134
    const-wide/16 v6, 0x0

    .line 135
    .line 136
    cmpl-double v6, v3, v6

    .line 137
    .line 138
    if-lez v6, :cond_4

    .line 139
    .line 140
    sget-object v0, LH1/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 141
    .line 142
    :try_start_3
    invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    check-cast v0, Landroid/app/ActivityManager;

    .line 150
    .line 151
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 156
    .line 157
    const/high16 v2, 0x100000

    .line 158
    .line 159
    and-int/2addr v1, v2

    .line 160
    if-eqz v1, :cond_3

    .line 161
    .line 162
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    goto :goto_2

    .line 167
    :cond_3
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 168
    .line 169
    .line 170
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 171
    goto :goto_2

    .line 172
    :catch_1
    const/16 v0, 0x100

    .line 173
    .line 174
    :goto_2
    int-to-double v0, v0

    .line 175
    mul-double/2addr v3, v0

    .line 176
    const/16 v0, 0x400

    .line 177
    .line 178
    int-to-double v0, v0

    .line 179
    mul-double/2addr v3, v0

    .line 180
    mul-double/2addr v3, v0

    .line 181
    double-to-int v0, v3

    .line 182
    :cond_4
    if-lez v0, :cond_5

    .line 183
    .line 184
    new-instance v1, LA1/g;

    .line 185
    .line 186
    invoke-direct {v1, v0, v5}, LA1/g;-><init>(ILA1/i;)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_5
    new-instance v1, Lb7/c;

    .line 191
    .line 192
    const/4 v0, 0x1

    .line 193
    invoke-direct {v1, v0, v5}, Lb7/c;-><init>(ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :goto_3
    new-instance v0, LA1/d;

    .line 197
    .line 198
    invoke-direct {v0, v1, v5}, LA1/d;-><init>(LA1/j;LA1/i;)V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
