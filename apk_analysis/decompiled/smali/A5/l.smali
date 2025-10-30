.class public final LA5/l;
.super LA5/n;
.source "SourceFile"


# static fields
.field public static final q:LA5/k;


# instance fields
.field public final l:LA5/p;

.field public final m:Lc0/e;

.field public final n:Lc0/d;

.field public final o:LA5/o;

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LA5/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LA5/l;->q:LA5/k;

    .line 7
    .line 8
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
.end method

.method public constructor <init>(Landroid/content/Context;LA5/e;LA5/p;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, LA5/n;-><init>(Landroid/content/Context;LA5/e;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, LA5/l;->p:Z

    .line 6
    .line 7
    iput-object p3, p0, LA5/l;->l:LA5/p;

    .line 8
    .line 9
    new-instance p2, LA5/o;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, LA5/l;->o:LA5/o;

    .line 15
    .line 16
    new-instance p2, Lc0/e;

    .line 17
    .line 18
    invoke-direct {p2}, Lc0/e;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, LA5/l;->m:Lc0/e;

    .line 22
    .line 23
    const/high16 p3, 0x3f800000    # 1.0f

    .line 24
    .line 25
    float-to-double v0, p3

    .line 26
    iput-wide v0, p2, Lc0/e;->b:D

    .line 27
    .line 28
    iput-boolean p1, p2, Lc0/e;->c:Z

    .line 29
    .line 30
    const/high16 v0, 0x42480000    # 50.0f

    .line 31
    .line 32
    float-to-double v0, v0

    .line 33
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iput-wide v0, p2, Lc0/e;->a:D

    .line 38
    .line 39
    iput-boolean p1, p2, Lc0/e;->c:Z

    .line 40
    .line 41
    new-instance p1, Lc0/d;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Lc0/d;-><init>(LA5/l;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, LA5/l;->n:Lc0/d;

    .line 47
    .line 48
    iput-object p2, p1, Lc0/d;->k:Lc0/e;

    .line 49
    .line 50
    iget p1, p0, LA5/n;->h:F

    .line 51
    .line 52
    cmpl-float p1, p1, p3

    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    iput p3, p0, LA5/n;->h:F

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
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
.end method


# virtual methods
.method public final d(ZZZ)Z
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, LA5/n;->d(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p2, p0, LA5/n;->c:LA5/a;

    .line 6
    .line 7
    iget-object p3, p0, LA5/n;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p2, "animator_duration_scale"

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-static {p3, p2, v0}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 p3, 0x0

    .line 25
    cmpl-float v0, p2, p3

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    iput-boolean p2, p0, LA5/l;->p:Z

    .line 31
    .line 32
    return p1

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, LA5/l;->p:Z

    .line 35
    .line 36
    const/high16 v1, 0x42480000    # 50.0f

    .line 37
    .line 38
    div-float/2addr v1, p2

    .line 39
    iget-object p2, p0, LA5/l;->m:Lc0/e;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    cmpg-float p3, v1, p3

    .line 45
    .line 46
    if-lez p3, :cond_1

    .line 47
    .line 48
    float-to-double v1, v1

    .line 49
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    iput-wide v1, p2, Lc0/e;->a:D

    .line 54
    .line 55
    iput-boolean v0, p2, Lc0/e;->c:Z

    .line 56
    .line 57
    return p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    const-string p2, "Spring stiffness constant must be positive."

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
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
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_7

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_7

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_7

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, LA5/l;->l:LA5/p;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0}, LA5/n;->b()F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v4, p0, LA5/n;->d:Landroid/animation/ObjectAnimator;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v6, 0x1

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v4, v6

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    move v4, v8

    .line 59
    :goto_1
    iget-object v5, p0, LA5/n;->e:Landroid/animation/ObjectAnimator;

    .line 60
    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v5, v6

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    :goto_2
    move v5, v8

    .line 73
    :goto_3
    iget-object v7, v0, LA5/p;->a:LA5/e;

    .line 74
    .line 75
    invoke-virtual {v7}, LA5/e;->a()V

    .line 76
    .line 77
    .line 78
    move-object v1, p1

    .line 79
    invoke-virtual/range {v0 .. v5}, LA5/p;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    .line 80
    .line 81
    .line 82
    iget-object v2, p0, LA5/n;->i:Landroid/graphics/Paint;

    .line 83
    .line 84
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v9, p0, LA5/n;->b:LA5/e;

    .line 93
    .line 94
    iget-object v0, v9, LA5/e;->c:[I

    .line 95
    .line 96
    aget v0, v0, v8

    .line 97
    .line 98
    iget-object v10, p0, LA5/l;->o:LA5/o;

    .line 99
    .line 100
    iput v0, v10, LA5/o;->c:I

    .line 101
    .line 102
    iget v0, v9, LA5/e;->g:I

    .line 103
    .line 104
    if-lez v0, :cond_6

    .line 105
    .line 106
    iget-object v1, p0, LA5/l;->l:LA5/p;

    .line 107
    .line 108
    instance-of v1, v1, LA5/s;

    .line 109
    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    :goto_4
    move v7, v0

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    int-to-float v0, v0

    .line 115
    iget v1, v10, LA5/o;->b:F

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    const v4, 0x3c23d70a    # 0.01f

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v3, v4}, LB6/u0;->j(FFF)F

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    mul-float/2addr v1, v0

    .line 126
    div-float/2addr v1, v4

    .line 127
    float-to-int v0, v1

    .line 128
    goto :goto_4

    .line 129
    :goto_5
    iget-object v0, p0, LA5/l;->l:LA5/p;

    .line 130
    .line 131
    iget v3, v10, LA5/o;->b:F

    .line 132
    .line 133
    iget v5, v9, LA5/e;->d:I

    .line 134
    .line 135
    iget v6, p0, LA5/n;->j:I

    .line 136
    .line 137
    const/high16 v4, 0x3f800000    # 1.0f

    .line 138
    .line 139
    move-object v1, p1

    .line 140
    invoke-virtual/range {v0 .. v7}, LA5/p;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget-object v0, p0, LA5/l;->l:LA5/p;

    .line 145
    .line 146
    iget v5, v9, LA5/e;->d:I

    .line 147
    .line 148
    iget v6, p0, LA5/n;->j:I

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    const/high16 v4, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    move-object v1, p1

    .line 155
    invoke-virtual/range {v0 .. v7}, LA5/p;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 156
    .line 157
    .line 158
    :goto_6
    iget-object v0, p0, LA5/l;->l:LA5/p;

    .line 159
    .line 160
    iget v3, p0, LA5/n;->j:I

    .line 161
    .line 162
    invoke-virtual {v0, p1, v2, v10, v3}, LA5/p;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;LA5/o;I)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, LA5/l;->l:LA5/p;

    .line 166
    .line 167
    iget-object v3, v9, LA5/e;->c:[I

    .line 168
    .line 169
    aget v3, v3, v8

    .line 170
    .line 171
    iget v4, p0, LA5/n;->j:I

    .line 172
    .line 173
    invoke-virtual {v0, p1, v2, v3, v4}, LA5/p;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 177
    .line 178
    .line 179
    :cond_7
    :goto_7
    return-void
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

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, LA5/l;->l:LA5/p;

    .line 2
    .line 3
    invoke-virtual {v0}, LA5/p;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, LA5/l;->l:LA5/p;

    .line 2
    .line 3
    invoke-virtual {v0}, LA5/p;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final jumpToCurrentState()V
    .locals 2

    .line 1
    iget-object v0, p0, LA5/l;->n:Lc0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc0/d;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    int-to-float v0, v0

    .line 11
    const v1, 0x461c4000    # 10000.0f

    .line 12
    .line 13
    .line 14
    div-float/2addr v0, v1

    .line 15
    iget-object v1, p0, LA5/l;->o:LA5/o;

    .line 16
    .line 17
    iput v0, v1, LA5/o;->b:F

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public final onLevelChange(I)Z
    .locals 9

    .line 1
    iget-boolean v0, p0, LA5/l;->p:Z

    .line 2
    .line 3
    iget-object v1, p0, LA5/l;->o:LA5/o;

    .line 4
    .line 5
    const v2, 0x461c4000    # 10000.0f

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, LA5/l;->n:Lc0/d;

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Lc0/d;->b()V

    .line 14
    .line 15
    .line 16
    int-to-float p1, p1

    .line 17
    div-float/2addr p1, v2

    .line 18
    iput p1, v1, LA5/o;->b:F

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 21
    .line 22
    .line 23
    return v4

    .line 24
    :cond_0
    iget v0, v1, LA5/o;->b:F

    .line 25
    .line 26
    mul-float/2addr v0, v2

    .line 27
    iput v0, v3, Lc0/d;->b:F

    .line 28
    .line 29
    iput-boolean v4, v3, Lc0/d;->c:Z

    .line 30
    .line 31
    int-to-float p1, p1

    .line 32
    iget-boolean v0, v3, Lc0/d;->f:Z

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iput p1, v3, Lc0/d;->l:F

    .line 37
    .line 38
    return v4

    .line 39
    :cond_1
    iget-object v0, v3, Lc0/d;->k:Lc0/e;

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    new-instance v0, Lc0/e;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Lc0/e;-><init>(F)V

    .line 46
    .line 47
    .line 48
    iput-object v0, v3, Lc0/d;->k:Lc0/e;

    .line 49
    .line 50
    :cond_2
    iget-object v0, v3, Lc0/d;->k:Lc0/e;

    .line 51
    .line 52
    float-to-double v5, p1

    .line 53
    iput-wide v5, v0, Lc0/e;->i:D

    .line 54
    .line 55
    double-to-float p1, v5

    .line 56
    float-to-double v5, p1

    .line 57
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 58
    .line 59
    .line 60
    float-to-double v7, p1

    .line 61
    cmpl-double v1, v5, v7

    .line 62
    .line 63
    if-gtz v1, :cond_b

    .line 64
    .line 65
    const v1, -0x800001

    .line 66
    .line 67
    .line 68
    float-to-double v7, v1

    .line 69
    cmpg-double v5, v5, v7

    .line 70
    .line 71
    if-ltz v5, :cond_a

    .line 72
    .line 73
    iget v5, v3, Lc0/d;->h:F

    .line 74
    .line 75
    const/high16 v6, 0x3f400000    # 0.75f

    .line 76
    .line 77
    mul-float/2addr v5, v6

    .line 78
    float-to-double v5, v5

    .line 79
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    iput-wide v5, v0, Lc0/e;->d:D

    .line 84
    .line 85
    const-wide v7, 0x404f400000000000L    # 62.5

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    mul-double/2addr v5, v7

    .line 91
    iput-wide v5, v0, Lc0/e;->e:D

    .line 92
    .line 93
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    if-ne v0, v5, :cond_9

    .line 102
    .line 103
    iget-boolean v0, v3, Lc0/d;->f:Z

    .line 104
    .line 105
    if-nez v0, :cond_8

    .line 106
    .line 107
    if-nez v0, :cond_8

    .line 108
    .line 109
    iput-boolean v4, v3, Lc0/d;->f:Z

    .line 110
    .line 111
    iget-boolean v0, v3, Lc0/d;->c:Z

    .line 112
    .line 113
    if-nez v0, :cond_3

    .line 114
    .line 115
    iget-object v0, v3, Lc0/d;->e:LA5/k;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v0, v3, Lc0/d;->d:LA5/l;

    .line 121
    .line 122
    iget-object v0, v0, LA5/l;->o:LA5/o;

    .line 123
    .line 124
    iget v0, v0, LA5/o;->b:F

    .line 125
    .line 126
    mul-float/2addr v0, v2

    .line 127
    iput v0, v3, Lc0/d;->b:F

    .line 128
    .line 129
    :cond_3
    iget v0, v3, Lc0/d;->b:F

    .line 130
    .line 131
    cmpl-float p1, v0, p1

    .line 132
    .line 133
    if-gtz p1, :cond_7

    .line 134
    .line 135
    cmpg-float p1, v0, v1

    .line 136
    .line 137
    if-ltz p1, :cond_7

    .line 138
    .line 139
    sget-object p1, Lc0/a;->f:Ljava/lang/ThreadLocal;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-nez v0, :cond_4

    .line 146
    .line 147
    new-instance v0, Lc0/a;

    .line 148
    .line 149
    invoke-direct {v0}, Lc0/a;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Lc0/a;

    .line 160
    .line 161
    iget-object v0, p1, Lc0/a;->b:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-nez v1, :cond_6

    .line 168
    .line 169
    iget-object v1, p1, Lc0/a;->d:Lb5/G1;

    .line 170
    .line 171
    if-nez v1, :cond_5

    .line 172
    .line 173
    new-instance v1, Lb5/G1;

    .line 174
    .line 175
    iget-object v2, p1, Lc0/a;->c:Lb7/c;

    .line 176
    .line 177
    invoke-direct {v1, v2}, Lb5/G1;-><init>(Lb7/c;)V

    .line 178
    .line 179
    .line 180
    iput-object v1, p1, Lc0/a;->d:Lb5/G1;

    .line 181
    .line 182
    :cond_5
    iget-object p1, p1, Lc0/a;->d:Lb5/G1;

    .line 183
    .line 184
    iget-object v1, p1, Lb5/G1;->d:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, LW/e;

    .line 187
    .line 188
    iget-object p1, p1, Lb5/G1;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p1, Landroid/view/Choreographer;

    .line 191
    .line 192
    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-nez p1, :cond_8

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    return v4

    .line 205
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    const-string v0, "Starting value need to be in between min value and max value"

    .line 208
    .line 209
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1

    .line 213
    :cond_8
    return v4

    .line 214
    :cond_9
    new-instance p1, Landroid/util/AndroidRuntimeException;

    .line 215
    .line 216
    const-string v0, "Animations may only be started on the main thread"

    .line 217
    .line 218
    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw p1

    .line 222
    :cond_a
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 223
    .line 224
    const-string v0, "Final position of the spring cannot be less than the min value."

    .line 225
    .line 226
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw p1

    .line 230
    :cond_b
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 231
    .line 232
    const-string v0, "Final position of the spring cannot be greater than the max value."

    .line 233
    .line 234
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p1
    .line 238
    .line 239
    .line 240
.end method
