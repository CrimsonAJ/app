.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method public static synthetic a(LY2/r;)LT6/e;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Ls6/c;)LT6/e;

    move-result-object p0

    return-object p0
.end method

.method private static lambda$getComponents$0(Ls6/c;)LT6/e;
    .locals 7

    .line 1
    new-instance v0, LT6/d;

    .line 2
    .line 3
    const-class v1, Ll6/f;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Ls6/c;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ll6/f;

    .line 10
    .line 11
    const-class v2, LQ6/g;

    .line 12
    .line 13
    invoke-interface {p0, v2}, Ls6/c;->h(Ljava/lang/Class;)LS6/b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Ls6/p;

    .line 18
    .line 19
    const-class v4, Lr6/a;

    .line 20
    .line 21
    const-class v5, Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    invoke-direct {v3, v4, v5}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v3}, Ls6/c;->d(Ls6/p;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    new-instance v4, Ls6/p;

    .line 33
    .line 34
    const-class v5, Lr6/b;

    .line 35
    .line 36
    const-class v6, Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    invoke-direct {v4, v5, v6}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, v4}, Ls6/c;->d(Ls6/p;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    new-instance v4, Lt6/j;

    .line 48
    .line 49
    invoke-direct {v4, p0}, Lt6/j;-><init>(Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1, v2, v3, v4}, LT6/d;-><init>(Ll6/f;LS6/b;Ljava/util/concurrent/ExecutorService;Lt6/j;)V

    .line 53
    .line 54
    .line 55
    return-object v0
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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls6/b;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-class v2, LT6/e;

    .line 4
    .line 5
    invoke-static {v2}, Ls6/b;->a(Ljava/lang/Class;)Ls6/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "fire-installations"

    .line 10
    .line 11
    iput-object v3, v2, Ls6/a;->a:Ljava/lang/String;

    .line 12
    .line 13
    const-class v4, Ll6/f;

    .line 14
    .line 15
    invoke-static {v4}, Ls6/h;->a(Ljava/lang/Class;)Ls6/h;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v2, v4}, Ls6/a;->a(Ls6/h;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ls6/h;

    .line 23
    .line 24
    const-class v5, LQ6/g;

    .line 25
    .line 26
    invoke-direct {v4, v1, v0, v5}, Ls6/h;-><init>(IILjava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v4}, Ls6/a;->a(Ls6/h;)V

    .line 30
    .line 31
    .line 32
    new-instance v4, Ls6/p;

    .line 33
    .line 34
    const-class v5, Lr6/a;

    .line 35
    .line 36
    const-class v6, Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    invoke-direct {v4, v5, v6}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    new-instance v5, Ls6/h;

    .line 42
    .line 43
    invoke-direct {v5, v4, v0, v1}, Ls6/h;-><init>(Ls6/p;II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v5}, Ls6/a;->a(Ls6/h;)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Ls6/p;

    .line 50
    .line 51
    const-class v5, Lr6/b;

    .line 52
    .line 53
    const-class v6, Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    invoke-direct {v4, v5, v6}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 56
    .line 57
    .line 58
    new-instance v5, Ls6/h;

    .line 59
    .line 60
    invoke-direct {v5, v4, v0, v1}, Ls6/h;-><init>(Ls6/p;II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v5}, Ls6/a;->a(Ls6/h;)V

    .line 64
    .line 65
    .line 66
    new-instance v4, LC6/a;

    .line 67
    .line 68
    const/16 v5, 0x16

    .line 69
    .line 70
    invoke-direct {v4, v5}, LC6/a;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object v4, v2, Ls6/a;->f:Ls6/d;

    .line 74
    .line 75
    invoke-virtual {v2}, Ls6/a;->b()Ls6/b;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    new-instance v4, LQ6/f;

    .line 80
    .line 81
    invoke-direct {v4, v1}, LQ6/f;-><init>(I)V

    .line 82
    .line 83
    .line 84
    const-class v5, LQ6/f;

    .line 85
    .line 86
    invoke-static {v5}, Ls6/b;->a(Ljava/lang/Class;)Ls6/a;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    iput v0, v5, Ls6/a;->e:I

    .line 91
    .line 92
    new-instance v6, Lk3/c;

    .line 93
    .line 94
    invoke-direct {v6, v4}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iput-object v6, v5, Ls6/a;->f:Ls6/d;

    .line 98
    .line 99
    invoke-virtual {v5}, Ls6/a;->b()Ls6/b;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const-string v5, "18.0.0"

    .line 104
    .line 105
    invoke-static {v3, v5}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const/4 v5, 0x3

    .line 110
    new-array v5, v5, [Ls6/b;

    .line 111
    .line 112
    aput-object v2, v5, v1

    .line 113
    .line 114
    aput-object v4, v5, v0

    .line 115
    .line 116
    const/4 v0, 0x2

    .line 117
    aput-object v3, v5, v0

    .line 118
    .line 119
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0
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
.end method
