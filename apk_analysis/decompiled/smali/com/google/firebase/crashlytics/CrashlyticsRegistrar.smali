.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final synthetic d:I


# instance fields
.field public final a:Ls6/p;

.field public final b:Ls6/p;

.field public final c:Ls6/p;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Lj7/d;->a:Lj7/d;

    .line 2
    .line 3
    sget-object v1, Lj7/c;->b:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, "SessionsDependencies"

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Dependency "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, " already added."

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance v2, Lj7/a;

    .line 37
    .line 38
    new-instance v4, Lg8/d;

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    invoke-direct {v4, v5}, Lg8/d;-><init>(Z)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v4}, Lj7/a;-><init>(Lg8/d;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v2, "Dependency to "

    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, " added."

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    return-void
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls6/p;

    .line 5
    .line 6
    const-class v1, Lr6/a;

    .line 7
    .line 8
    const-class v2, Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Ls6/p;

    .line 14
    .line 15
    new-instance v0, Ls6/p;

    .line 16
    .line 17
    const-class v1, Lr6/b;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Ls6/p;

    .line 23
    .line 24
    new-instance v0, Ls6/p;

    .line 25
    .line 26
    const-class v1, Lr6/c;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Ls6/p;

    .line 32
    .line 33
    return-void
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


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    const-class v3, Lu6/b;

    .line 5
    .line 6
    invoke-static {v3}, Ls6/b;->a(Ljava/lang/Class;)Ls6/a;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "fire-cls"

    .line 11
    .line 12
    iput-object v4, v3, Ls6/a;->a:Ljava/lang/String;

    .line 13
    .line 14
    const-class v5, Ll6/f;

    .line 15
    .line 16
    invoke-static {v5}, Ls6/h;->a(Ljava/lang/Class;)Ls6/h;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {v3, v5}, Ls6/a;->a(Ls6/h;)V

    .line 21
    .line 22
    .line 23
    const-class v5, LT6/e;

    .line 24
    .line 25
    invoke-static {v5}, Ls6/h;->a(Ljava/lang/Class;)Ls6/h;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v3, v5}, Ls6/a;->a(Ls6/h;)V

    .line 30
    .line 31
    .line 32
    iget-object v5, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Ls6/p;

    .line 33
    .line 34
    new-instance v6, Ls6/h;

    .line 35
    .line 36
    invoke-direct {v6, v5, v2, v1}, Ls6/h;-><init>(Ls6/p;II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v6}, Ls6/a;->a(Ls6/h;)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Ls6/p;

    .line 43
    .line 44
    new-instance v6, Ls6/h;

    .line 45
    .line 46
    invoke-direct {v6, v5, v2, v1}, Ls6/h;-><init>(Ls6/p;II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v6}, Ls6/a;->a(Ls6/h;)V

    .line 50
    .line 51
    .line 52
    iget-object v5, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Ls6/p;

    .line 53
    .line 54
    new-instance v6, Ls6/h;

    .line 55
    .line 56
    invoke-direct {v6, v5, v2, v1}, Ls6/h;-><init>(Ls6/p;II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v6}, Ls6/a;->a(Ls6/h;)V

    .line 60
    .line 61
    .line 62
    new-instance v5, Ls6/h;

    .line 63
    .line 64
    const-class v6, Lv6/a;

    .line 65
    .line 66
    invoke-direct {v5, v1, v0, v6}, Ls6/h;-><init>(IILjava/lang/Class;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v5}, Ls6/a;->a(Ls6/h;)V

    .line 70
    .line 71
    .line 72
    new-instance v5, Ls6/h;

    .line 73
    .line 74
    const-class v6, Lp6/b;

    .line 75
    .line 76
    invoke-direct {v5, v1, v0, v6}, Ls6/h;-><init>(IILjava/lang/Class;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v5}, Ls6/a;->a(Ls6/h;)V

    .line 80
    .line 81
    .line 82
    new-instance v5, Ls6/h;

    .line 83
    .line 84
    const-class v6, Lf7/a;

    .line 85
    .line 86
    invoke-direct {v5, v1, v0, v6}, Ls6/h;-><init>(IILjava/lang/Class;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v5}, Ls6/a;->a(Ls6/h;)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Lj2/b;

    .line 93
    .line 94
    const/16 v6, 0x10

    .line 95
    .line 96
    invoke-direct {v5, v6, p0}, Lj2/b;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iput-object v5, v3, Ls6/a;->f:Ls6/d;

    .line 100
    .line 101
    invoke-virtual {v3, v0}, Ls6/a;->c(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ls6/a;->b()Ls6/b;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    const-string v5, "19.4.4"

    .line 109
    .line 110
    invoke-static {v4, v5}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    new-array v0, v0, [Ls6/b;

    .line 115
    .line 116
    aput-object v3, v0, v1

    .line 117
    .line 118
    aput-object v4, v0, v2

    .line 119
    .line 120
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0
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
