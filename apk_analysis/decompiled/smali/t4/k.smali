.class public final Lt4/k;
.super LG4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lt4/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:[Ljava/lang/String;

.field public static final e:Lb5/G1;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Landroid/os/Bundle;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v2, "int"

    .line 2
    .line 3
    const-string v3, "double"

    .line 4
    .line 5
    const-string v0, "none"

    .line 6
    .line 7
    const-string v1, "String"

    .line 8
    .line 9
    const-string v4, "ISO-8601 date String"

    .line 10
    .line 11
    const-string v5, "Time in milliseconds as long"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lt4/k;->d:[Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, Li5/b;

    .line 20
    .line 21
    const/16 v1, 0x14

    .line 22
    .line 23
    invoke-direct {v0, v1}, Li5/b;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lt4/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 27
    .line 28
    new-instance v0, Lb5/G1;

    .line 29
    .line 30
    const/16 v1, 0x1b

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lb5/G1;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const-string v1, "com.google.android.gms.cast.metadata.CREATION_DATE"

    .line 36
    .line 37
    const-string v2, "creationDateTime"

    .line 38
    .line 39
    const/4 v3, 0x4

    .line 40
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v1, "com.google.android.gms.cast.metadata.RELEASE_DATE"

    .line 44
    .line 45
    const-string v2, "releaseDate"

    .line 46
    .line 47
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v1, "com.google.android.gms.cast.metadata.BROADCAST_DATE"

    .line 51
    .line 52
    const-string v2, "originalAirdate"

    .line 53
    .line 54
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v1, "com.google.android.gms.cast.metadata.TITLE"

    .line 58
    .line 59
    const-string v2, "title"

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "com.google.android.gms.cast.metadata.SUBTITLE"

    .line 66
    .line 67
    const-string v2, "subtitle"

    .line 68
    .line 69
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v1, "com.google.android.gms.cast.metadata.ARTIST"

    .line 73
    .line 74
    const-string v2, "artist"

    .line 75
    .line 76
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST"

    .line 80
    .line 81
    const-string v2, "albumArtist"

    .line 82
    .line 83
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v1, "com.google.android.gms.cast.metadata.ALBUM_TITLE"

    .line 87
    .line 88
    const-string v2, "albumName"

    .line 89
    .line 90
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "com.google.android.gms.cast.metadata.COMPOSER"

    .line 94
    .line 95
    const-string v2, "composer"

    .line 96
    .line 97
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v1, "com.google.android.gms.cast.metadata.DISC_NUMBER"

    .line 101
    .line 102
    const-string v2, "discNumber"

    .line 103
    .line 104
    const/4 v4, 0x2

    .line 105
    invoke-virtual {v0, v1, v4, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string v1, "com.google.android.gms.cast.metadata.TRACK_NUMBER"

    .line 109
    .line 110
    const-string v2, "trackNumber"

    .line 111
    .line 112
    invoke-virtual {v0, v1, v4, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string v1, "com.google.android.gms.cast.metadata.SEASON_NUMBER"

    .line 116
    .line 117
    const-string v2, "season"

    .line 118
    .line 119
    invoke-virtual {v0, v1, v4, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const-string v1, "com.google.android.gms.cast.metadata.EPISODE_NUMBER"

    .line 123
    .line 124
    const-string v2, "episode"

    .line 125
    .line 126
    invoke-virtual {v0, v1, v4, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-string v1, "com.google.android.gms.cast.metadata.SERIES_TITLE"

    .line 130
    .line 131
    const-string v2, "seriesTitle"

    .line 132
    .line 133
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string v1, "com.google.android.gms.cast.metadata.STUDIO"

    .line 137
    .line 138
    const-string v2, "studio"

    .line 139
    .line 140
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string v1, "com.google.android.gms.cast.metadata.WIDTH"

    .line 144
    .line 145
    const-string v2, "width"

    .line 146
    .line 147
    invoke-virtual {v0, v1, v4, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const-string v1, "com.google.android.gms.cast.metadata.HEIGHT"

    .line 151
    .line 152
    const-string v2, "height"

    .line 153
    .line 154
    invoke-virtual {v0, v1, v4, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v1, "com.google.android.gms.cast.metadata.LOCATION_NAME"

    .line 158
    .line 159
    const-string v2, "location"

    .line 160
    .line 161
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v1, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE"

    .line 165
    .line 166
    const-string v2, "latitude"

    .line 167
    .line 168
    const/4 v5, 0x3

    .line 169
    invoke-virtual {v0, v1, v5, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string v1, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE"

    .line 173
    .line 174
    const-string v2, "longitude"

    .line 175
    .line 176
    invoke-virtual {v0, v1, v5, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 177
    .line 178
    .line 179
    const-string v1, "com.google.android.gms.cast.metadata.SECTION_DURATION"

    .line 180
    .line 181
    const-string v2, "sectionDuration"

    .line 182
    .line 183
    const/4 v5, 0x5

    .line 184
    invoke-virtual {v0, v1, v5, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const-string v1, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"

    .line 188
    .line 189
    const-string v2, "sectionStartTimeInMedia"

    .line 190
    .line 191
    invoke-virtual {v0, v1, v5, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const-string v1, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME"

    .line 195
    .line 196
    const-string v2, "sectionStartAbsoluteTime"

    .line 197
    .line 198
    invoke-virtual {v0, v1, v5, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-string v1, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"

    .line 202
    .line 203
    const-string v2, "sectionStartTimeInContainer"

    .line 204
    .line 205
    invoke-virtual {v0, v1, v5, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 206
    .line 207
    .line 208
    const-string v1, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"

    .line 209
    .line 210
    const-string v2, "queueItemId"

    .line 211
    .line 212
    invoke-virtual {v0, v1, v4, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string v1, "com.google.android.gms.cast.metadata.BOOK_TITLE"

    .line 216
    .line 217
    const-string v2, "bookTitle"

    .line 218
    .line 219
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const-string v1, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER"

    .line 223
    .line 224
    const-string v2, "chapterNumber"

    .line 225
    .line 226
    invoke-virtual {v0, v1, v4, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const-string v1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE"

    .line 230
    .line 231
    const-string v2, "chapterTitle"

    .line 232
    .line 233
    invoke-virtual {v0, v1, v3, v2}, Lb5/G1;->B(Ljava/lang/String;ILjava/lang/String;)V

    .line 234
    .line 235
    .line 236
    sput-object v0, Lt4/k;->e:Lb5/G1;

    .line 237
    .line 238
    return-void
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

.method public constructor <init>(I)V
    .locals 2

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p0, v0, v1, p1}, Lt4/k;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt4/k;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lt4/k;->b:Landroid/os/Bundle;

    iput p3, p0, Lt4/k;->c:I

    return-void
.end method

.method public static i(ILjava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    sget-object v0, Lt4/k;->e:Lb5/G1;

    .line 8
    .line 9
    iget-object v0, v0, Lb5/G1;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-eq v0, p0, :cond_2

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    sget-object v1, Lt4/k;->d:[Ljava/lang/String;

    .line 35
    .line 36
    aget-object p0, v1, p0

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v2, "Value for "

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p1, " must be a "

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    :goto_1
    return-void

    .line 65
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const-string p1, "null and empty keys are not allowed"

    .line 68
    .line 69
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
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

.method public static p(Landroid/os/Bundle;Landroid/os/Bundle;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/os/BaseBundle;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/os/BaseBundle;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_5

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    instance-of v4, v2, Landroid/os/Bundle;

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    instance-of v4, v3, Landroid/os/Bundle;

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    move-object v4, v2

    .line 49
    check-cast v4, Landroid/os/Bundle;

    .line 50
    .line 51
    move-object v5, v3

    .line 52
    check-cast v5, Landroid/os/Bundle;

    .line 53
    .line 54
    invoke-static {v4, v5}, Lt4/k;->p(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez v2, :cond_3

    .line 61
    .line 62
    if-nez v3, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_1

    .line 76
    .line 77
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_5
    const/4 p0, 0x1

    .line 80
    return p0
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lt4/k;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lt4/k;

    .line 10
    .line 11
    iget-object v0, p1, Lt4/k;->b:Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object v1, p0, Lt4/k;->b:Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lt4/k;->p(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lt4/k;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object p1, p1, Lt4/k;->a:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    :goto_0
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 34
    return p1
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p1}, Lt4/k;->i(ILjava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lt4/k;->b:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public final g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p1}, Lt4/k;->i(ILjava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lt4/k;->b:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
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

.method public final hashCode()I
    .locals 4

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    iget-object v1, p0, Lt4/k;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    mul-int/lit8 v0, v0, 0x1f

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const/4 v3, 0x0

    .line 41
    :goto_1
    add-int/2addr v0, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, Lt4/k;->a:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v1, v0

    .line 52
    return v1
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

.method public final k()Lorg/json/JSONObject;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-instance v2, Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    const-string v3, "metadataType"

    .line 10
    .line 11
    iget v4, v0, Lt4/k;->c:I

    .line 12
    .line 13
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    iget-object v3, v0, Lt4/k;->a:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {v3}, Lz4/a;->b(Ljava/util/ArrayList;)Lorg/json/JSONArray;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    :try_start_1
    const-string v4, "images"

    .line 29
    .line 30
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 31
    .line 32
    .line 33
    :catch_1
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iget v4, v0, Lt4/k;->c:I

    .line 39
    .line 40
    const-string v5, "com.google.android.gms.cast.metadata.RELEASE_DATE"

    .line 41
    .line 42
    const/4 v6, 0x5

    .line 43
    const/4 v7, 0x4

    .line 44
    const/4 v8, 0x3

    .line 45
    const/4 v9, 0x2

    .line 46
    const-string v10, "com.google.android.gms.cast.metadata.SUBTITLE"

    .line 47
    .line 48
    const-string v11, "com.google.android.gms.cast.metadata.TITLE"

    .line 49
    .line 50
    if-eqz v4, :cond_6

    .line 51
    .line 52
    if-eq v4, v1, :cond_5

    .line 53
    .line 54
    if-eq v4, v9, :cond_4

    .line 55
    .line 56
    if-eq v4, v8, :cond_3

    .line 57
    .line 58
    if-eq v4, v7, :cond_2

    .line 59
    .line 60
    if-eq v4, v6, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const-string v4, "com.google.android.gms.cast.metadata.BOOK_TITLE"

    .line 64
    .line 65
    const-string v5, "com.google.android.gms.cast.metadata.CHAPTER_TITLE"

    .line 66
    .line 67
    const-string v12, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER"

    .line 68
    .line 69
    filled-new-array {v5, v12, v11, v4, v10}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v3, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    const-string v14, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE"

    .line 78
    .line 79
    const-string v15, "com.google.android.gms.cast.metadata.WIDTH"

    .line 80
    .line 81
    const-string v10, "com.google.android.gms.cast.metadata.TITLE"

    .line 82
    .line 83
    const-string v11, "com.google.android.gms.cast.metadata.ARTIST"

    .line 84
    .line 85
    const-string v12, "com.google.android.gms.cast.metadata.LOCATION_NAME"

    .line 86
    .line 87
    const-string v13, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE"

    .line 88
    .line 89
    const-string v16, "com.google.android.gms.cast.metadata.HEIGHT"

    .line 90
    .line 91
    const-string v17, "com.google.android.gms.cast.metadata.CREATION_DATE"

    .line 92
    .line 93
    filled-new-array/range {v10 .. v17}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-static {v3, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    const-string v14, "com.google.android.gms.cast.metadata.COMPOSER"

    .line 102
    .line 103
    const-string v15, "com.google.android.gms.cast.metadata.TRACK_NUMBER"

    .line 104
    .line 105
    const-string v10, "com.google.android.gms.cast.metadata.TITLE"

    .line 106
    .line 107
    const-string v11, "com.google.android.gms.cast.metadata.ARTIST"

    .line 108
    .line 109
    const-string v12, "com.google.android.gms.cast.metadata.ALBUM_TITLE"

    .line 110
    .line 111
    const-string v13, "com.google.android.gms.cast.metadata.ALBUM_ARTIST"

    .line 112
    .line 113
    const-string v16, "com.google.android.gms.cast.metadata.DISC_NUMBER"

    .line 114
    .line 115
    const-string v17, "com.google.android.gms.cast.metadata.RELEASE_DATE"

    .line 116
    .line 117
    filled-new-array/range {v10 .. v17}, [Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-static {v3, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    const-string v4, "com.google.android.gms.cast.metadata.SERIES_TITLE"

    .line 126
    .line 127
    const-string v5, "com.google.android.gms.cast.metadata.SEASON_NUMBER"

    .line 128
    .line 129
    const-string v10, "com.google.android.gms.cast.metadata.EPISODE_NUMBER"

    .line 130
    .line 131
    const-string v12, "com.google.android.gms.cast.metadata.BROADCAST_DATE"

    .line 132
    .line 133
    filled-new-array {v11, v4, v5, v10, v12}, [Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-static {v3, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_5
    const-string v4, "com.google.android.gms.cast.metadata.STUDIO"

    .line 142
    .line 143
    filled-new-array {v11, v4, v10, v5}, [Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v3, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_6
    const-string v4, "com.google.android.gms.cast.metadata.ARTIST"

    .line 152
    .line 153
    filled-new-array {v11, v4, v10, v5}, [Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-static {v3, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :goto_0
    const-string v4, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"

    .line 161
    .line 162
    const-string v5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME"

    .line 163
    .line 164
    const-string v10, "com.google.android.gms.cast.metadata.SECTION_DURATION"

    .line 165
    .line 166
    const-string v11, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"

    .line 167
    .line 168
    const-string v12, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"

    .line 169
    .line 170
    filled-new-array {v10, v4, v5, v11, v12}, [Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v3, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :try_start_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v4
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 181
    const/4 v5, 0x0

    .line 182
    move v10, v5

    .line 183
    :cond_7
    :goto_1
    iget-object v11, v0, Lt4/k;->b:Landroid/os/Bundle;

    .line 184
    .line 185
    if-ge v10, v4, :cond_d

    .line 186
    .line 187
    :try_start_3
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    add-int/2addr v10, v1

    .line 192
    check-cast v12, Ljava/lang/String;

    .line 193
    .line 194
    if-eqz v12, :cond_7

    .line 195
    .line 196
    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-eqz v13, :cond_7

    .line 201
    .line 202
    sget-object v13, Lt4/k;->e:Lb5/G1;

    .line 203
    .line 204
    iget-object v14, v13, Lb5/G1;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v14, Ljava/util/HashMap;

    .line 207
    .line 208
    invoke-virtual {v14, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    check-cast v14, Ljava/lang/String;

    .line 213
    .line 214
    if-eqz v14, :cond_7

    .line 215
    .line 216
    iget-object v13, v13, Lb5/G1;->d:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v13, Ljava/util/HashMap;

    .line 219
    .line 220
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v13

    .line 224
    check-cast v13, Ljava/lang/Integer;

    .line 225
    .line 226
    if-eqz v13, :cond_8

    .line 227
    .line 228
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    goto :goto_2

    .line 233
    :cond_8
    move v13, v5

    .line 234
    :goto_2
    if-eq v13, v1, :cond_c

    .line 235
    .line 236
    if-eq v13, v9, :cond_b

    .line 237
    .line 238
    if-eq v13, v8, :cond_a

    .line 239
    .line 240
    if-eq v13, v7, :cond_c

    .line 241
    .line 242
    if-eq v13, v6, :cond_9

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_9
    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 246
    .line 247
    .line 248
    move-result-wide v11

    .line 249
    sget-object v13, Ly4/a;->a:Ljava/util/regex/Pattern;

    .line 250
    .line 251
    long-to-double v11, v11

    .line 252
    const-wide v15, 0x408f400000000000L    # 1000.0

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    div-double/2addr v11, v15

    .line 258
    invoke-virtual {v2, v14, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_a
    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 263
    .line 264
    .line 265
    move-result-wide v11

    .line 266
    invoke-virtual {v2, v14, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 267
    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_b
    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    invoke-virtual {v2, v14, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 275
    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_c
    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    invoke-virtual {v2, v14, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_d
    invoke-virtual {v11}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    :cond_e
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_11

    .line 299
    .line 300
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    check-cast v3, Ljava/lang/String;

    .line 305
    .line 306
    const-string v4, "com.google."

    .line 307
    .line 308
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-nez v4, :cond_e

    .line 313
    .line 314
    invoke-virtual {v11, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    instance-of v5, v4, Ljava/lang/String;

    .line 319
    .line 320
    if-eqz v5, :cond_f

    .line 321
    .line 322
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 323
    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_f
    instance-of v5, v4, Ljava/lang/Integer;

    .line 327
    .line 328
    if-eqz v5, :cond_10

    .line 329
    .line 330
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 331
    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_10
    instance-of v5, v4, Ljava/lang/Double;

    .line 335
    .line 336
    if-eqz v5, :cond_e

    .line 337
    .line 338
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 339
    .line 340
    .line 341
    goto :goto_3

    .line 342
    :catch_2
    :cond_11
    return-object v2
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

.method public final o(Lorg/json/JSONObject;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "metadataType"

    .line 6
    .line 7
    iget-object v3, v0, Lt4/k;->b:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {v3}, Landroid/os/Bundle;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object v4, v0, Lt4/k;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    iput v5, v0, Lt4/k;->c:I

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    iput v6, v0, Lt4/k;->c:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    :catch_0
    const-string v6, "images"

    .line 27
    .line 28
    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    invoke-static {v4, v6}, Lz4/a;->c(Ljava/util/ArrayList;Lorg/json/JSONArray;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iget v6, v0, Lt4/k;->c:I

    .line 43
    .line 44
    const-string v7, "com.google.android.gms.cast.metadata.RELEASE_DATE"

    .line 45
    .line 46
    const/4 v8, 0x5

    .line 47
    const/4 v9, 0x4

    .line 48
    const/4 v10, 0x3

    .line 49
    const/4 v11, 0x2

    .line 50
    const/4 v12, 0x1

    .line 51
    const-string v13, "com.google.android.gms.cast.metadata.SUBTITLE"

    .line 52
    .line 53
    const-string v14, "com.google.android.gms.cast.metadata.TITLE"

    .line 54
    .line 55
    if-eqz v6, :cond_6

    .line 56
    .line 57
    if-eq v6, v12, :cond_5

    .line 58
    .line 59
    if-eq v6, v11, :cond_4

    .line 60
    .line 61
    if-eq v6, v10, :cond_3

    .line 62
    .line 63
    if-eq v6, v9, :cond_2

    .line 64
    .line 65
    if-eq v6, v8, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const-string v6, "com.google.android.gms.cast.metadata.BOOK_TITLE"

    .line 69
    .line 70
    const-string v7, "com.google.android.gms.cast.metadata.CHAPTER_TITLE"

    .line 71
    .line 72
    const-string v15, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER"

    .line 73
    .line 74
    filled-new-array {v7, v15, v14, v6, v13}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v4, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    const-string v17, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE"

    .line 83
    .line 84
    const-string v18, "com.google.android.gms.cast.metadata.WIDTH"

    .line 85
    .line 86
    const-string v13, "com.google.android.gms.cast.metadata.TITLE"

    .line 87
    .line 88
    const-string v14, "com.google.android.gms.cast.metadata.ARTIST"

    .line 89
    .line 90
    const-string v15, "com.google.android.gms.cast.metadata.LOCATION_NAME"

    .line 91
    .line 92
    const-string v16, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE"

    .line 93
    .line 94
    const-string v19, "com.google.android.gms.cast.metadata.HEIGHT"

    .line 95
    .line 96
    const-string v20, "com.google.android.gms.cast.metadata.CREATION_DATE"

    .line 97
    .line 98
    filled-new-array/range {v13 .. v20}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-static {v4, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    const-string v17, "com.google.android.gms.cast.metadata.COMPOSER"

    .line 107
    .line 108
    const-string v18, "com.google.android.gms.cast.metadata.TRACK_NUMBER"

    .line 109
    .line 110
    const-string v13, "com.google.android.gms.cast.metadata.TITLE"

    .line 111
    .line 112
    const-string v14, "com.google.android.gms.cast.metadata.ALBUM_TITLE"

    .line 113
    .line 114
    const-string v15, "com.google.android.gms.cast.metadata.ARTIST"

    .line 115
    .line 116
    const-string v16, "com.google.android.gms.cast.metadata.ALBUM_ARTIST"

    .line 117
    .line 118
    const-string v19, "com.google.android.gms.cast.metadata.DISC_NUMBER"

    .line 119
    .line 120
    const-string v20, "com.google.android.gms.cast.metadata.RELEASE_DATE"

    .line 121
    .line 122
    filled-new-array/range {v13 .. v20}, [Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-static {v4, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    const-string v6, "com.google.android.gms.cast.metadata.SERIES_TITLE"

    .line 131
    .line 132
    const-string v7, "com.google.android.gms.cast.metadata.SEASON_NUMBER"

    .line 133
    .line 134
    const-string v13, "com.google.android.gms.cast.metadata.EPISODE_NUMBER"

    .line 135
    .line 136
    const-string v15, "com.google.android.gms.cast.metadata.BROADCAST_DATE"

    .line 137
    .line 138
    filled-new-array {v14, v6, v7, v13, v15}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-static {v4, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_5
    const-string v6, "com.google.android.gms.cast.metadata.STUDIO"

    .line 147
    .line 148
    filled-new-array {v14, v6, v13, v7}, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-static {v4, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_6
    const-string v6, "com.google.android.gms.cast.metadata.ARTIST"

    .line 157
    .line 158
    filled-new-array {v14, v6, v13, v7}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-static {v4, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    :goto_0
    const-string v6, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"

    .line 166
    .line 167
    const-string v7, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME"

    .line 168
    .line 169
    const-string v13, "com.google.android.gms.cast.metadata.SECTION_DURATION"

    .line 170
    .line 171
    const-string v14, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"

    .line 172
    .line 173
    const-string v15, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"

    .line 174
    .line 175
    filled-new-array {v13, v6, v7, v14, v15}, [Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-static {v4, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    new-instance v6, Ljava/util/HashSet;

    .line 183
    .line 184
    invoke-direct {v6, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 185
    .line 186
    .line 187
    :try_start_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    :cond_7
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-eqz v7, :cond_12

    .line 196
    .line 197
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    check-cast v7, Ljava/lang/String;

    .line 202
    .line 203
    if-eqz v7, :cond_7

    .line 204
    .line 205
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-nez v13, :cond_7

    .line 210
    .line 211
    sget-object v13, Lt4/k;->e:Lb5/G1;

    .line 212
    .line 213
    iget-object v14, v13, Lb5/G1;->c:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v14, Ljava/util/HashMap;

    .line 216
    .line 217
    invoke-virtual {v14, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v14

    .line 221
    check-cast v14, Ljava/lang/String;

    .line 222
    .line 223
    if-eqz v14, :cond_f

    .line 224
    .line 225
    invoke-virtual {v6, v14}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v15
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_3

    .line 229
    if-eqz v15, :cond_7

    .line 230
    .line 231
    :try_start_2
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v15

    .line 235
    if-eqz v15, :cond_7

    .line 236
    .line 237
    iget-object v13, v13, Lb5/G1;->d:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v13, Ljava/util/HashMap;

    .line 240
    .line 241
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v13

    .line 245
    check-cast v13, Ljava/lang/Integer;

    .line 246
    .line 247
    if-eqz v13, :cond_8

    .line 248
    .line 249
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    goto :goto_2

    .line 254
    :cond_8
    move v13, v5

    .line 255
    :goto_2
    if-eq v13, v12, :cond_e

    .line 256
    .line 257
    if-eq v13, v11, :cond_d

    .line 258
    .line 259
    if-eq v13, v10, :cond_c

    .line 260
    .line 261
    if-eq v13, v9, :cond_b

    .line 262
    .line 263
    if-eq v13, v8, :cond_9

    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_9
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 267
    .line 268
    .line 269
    move-result-wide v15

    .line 270
    sget-object v7, Ly4/a;->a:Ljava/util/regex/Pattern;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 271
    .line 272
    const-wide/16 v17, 0x3e8

    .line 273
    .line 274
    move-object/from16 v19, v6

    .line 275
    .line 276
    mul-long v5, v15, v17

    .line 277
    .line 278
    :try_start_3
    invoke-virtual {v3, v14, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 279
    .line 280
    .line 281
    :catch_1
    :cond_a
    :goto_3
    move-object/from16 v6, v19

    .line 282
    .line 283
    const/4 v5, 0x0

    .line 284
    goto :goto_1

    .line 285
    :catch_2
    move-object/from16 v19, v6

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_b
    move-object/from16 v19, v6

    .line 289
    .line 290
    instance-of v5, v15, Ljava/lang/String;

    .line 291
    .line 292
    if-eqz v5, :cond_a

    .line 293
    .line 294
    check-cast v15, Ljava/lang/String;

    .line 295
    .line 296
    invoke-static {v15}, Lz4/a;->a(Ljava/lang/String;)Ljava/util/Calendar;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    if-eqz v5, :cond_a

    .line 301
    .line 302
    invoke-virtual {v3, v14, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_c
    move-object/from16 v19, v6

    .line 307
    .line 308
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    .line 309
    .line 310
    .line 311
    move-result-wide v5

    .line 312
    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-nez v7, :cond_a

    .line 317
    .line 318
    invoke-virtual {v3, v14, v5, v6}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 319
    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_d
    move-object/from16 v19, v6

    .line 323
    .line 324
    instance-of v5, v15, Ljava/lang/Integer;

    .line 325
    .line 326
    if-eqz v5, :cond_a

    .line 327
    .line 328
    check-cast v15, Ljava/lang/Integer;

    .line 329
    .line 330
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    invoke-virtual {v3, v14, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_e
    move-object/from16 v19, v6

    .line 339
    .line 340
    instance-of v5, v15, Ljava/lang/String;

    .line 341
    .line 342
    if-eqz v5, :cond_a

    .line 343
    .line 344
    check-cast v15, Ljava/lang/String;

    .line 345
    .line 346
    invoke-virtual {v3, v14, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 347
    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_f
    move-object/from16 v19, v6

    .line 351
    .line 352
    :try_start_4
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    instance-of v6, v5, Ljava/lang/String;

    .line 357
    .line 358
    if-eqz v6, :cond_10

    .line 359
    .line 360
    check-cast v5, Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual {v3, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    goto :goto_3

    .line 366
    :cond_10
    instance-of v6, v5, Ljava/lang/Integer;

    .line 367
    .line 368
    if-eqz v6, :cond_11

    .line 369
    .line 370
    check-cast v5, Ljava/lang/Integer;

    .line 371
    .line 372
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    invoke-virtual {v3, v7, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 377
    .line 378
    .line 379
    goto :goto_3

    .line 380
    :cond_11
    instance-of v6, v5, Ljava/lang/Double;

    .line 381
    .line 382
    if-eqz v6, :cond_a

    .line 383
    .line 384
    check-cast v5, Ljava/lang/Double;

    .line 385
    .line 386
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 387
    .line 388
    .line 389
    move-result-wide v5

    .line 390
    invoke-virtual {v3, v7, v5, v6}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    .line 391
    .line 392
    .line 393
    goto :goto_3

    .line 394
    :catch_3
    :cond_12
    return-void
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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, p2}, Ls8/n;->R(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x2

    .line 8
    iget-object v1, p0, Lt4/k;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Ls8/n;->P(Landroid/os/Parcel;ILjava/util/List;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    iget-object v1, p0, Lt4/k;->b:Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Ls8/n;->F(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lt4/k;->c:I

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-static {p1, v1, v1}, Ls8/n;->V(Landroid/os/Parcel;II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, Ls8/n;->U(Landroid/os/Parcel;I)V

    .line 29
    .line 30
    .line 31
    return-void
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
