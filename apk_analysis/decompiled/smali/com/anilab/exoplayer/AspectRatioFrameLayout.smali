.class public final Lcom/anilab/exoplayer/AspectRatioFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:LQ2/b;

.field public b:LQ2/a;

.field public c:F

.field public d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->d:I

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v1, LQ2/h;->a:[I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :try_start_0
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iput p2, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p2

    .line 30
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    .line 32
    .line 33
    throw p2

    .line 34
    :cond_0
    :goto_0
    new-instance p1, LQ2/b;

    .line 35
    .line 36
    invoke-direct {p1, p0}, LQ2/b;-><init>(Lcom/anilab/exoplayer/AspectRatioFrameLayout;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->a:LQ2/b;

    .line 40
    .line 41
    return-void
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


# virtual methods
.method public getResizeMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->d:I

    .line 2
    .line 3
    return v0
    .line 4
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

.method public final onMeasure(II)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    cmpg-float p1, p1, p2

    .line 8
    .line 9
    if-gtz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-float v1, p1

    .line 21
    int-to-float v2, v0

    .line 22
    div-float v3, v1, v2

    .line 23
    .line 24
    iget v4, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 25
    .line 26
    div-float/2addr v4, v3

    .line 27
    const/high16 v3, 0x3f800000    # 1.0f

    .line 28
    .line 29
    sub-float/2addr v4, v3

    .line 30
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const v5, 0x3c23d70a    # 0.01f

    .line 35
    .line 36
    .line 37
    cmpg-float v3, v3, v5

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    iget-object v6, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->a:LQ2/b;

    .line 41
    .line 42
    if-gtz v3, :cond_2

    .line 43
    .line 44
    iget-boolean p1, v6, LQ2/b;->b:Z

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    iput-boolean v5, v6, LQ2/b;->b:Z

    .line 49
    .line 50
    iget-object p1, v6, LQ2/b;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 53
    .line 54
    invoke-virtual {p1, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_0
    return-void

    .line 58
    :cond_2
    iget v3, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->d:I

    .line 59
    .line 60
    if-eqz v3, :cond_7

    .line 61
    .line 62
    if-eq v3, v5, :cond_6

    .line 63
    .line 64
    const/4 v7, 0x2

    .line 65
    if-eq v3, v7, :cond_5

    .line 66
    .line 67
    const/4 v7, 0x4

    .line 68
    if-eq v3, v7, :cond_3

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    cmpl-float p2, v4, p2

    .line 72
    .line 73
    if-lez p2, :cond_4

    .line 74
    .line 75
    iget p1, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 76
    .line 77
    :goto_1
    mul-float/2addr v2, p1

    .line 78
    float-to-int p1, v2

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    iget p2, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 81
    .line 82
    :goto_2
    div-float/2addr v1, p2

    .line 83
    float-to-int v0, v1

    .line 84
    goto :goto_3

    .line 85
    :cond_5
    iget p1, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    iget p2, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_7
    cmpl-float p2, v4, p2

    .line 92
    .line 93
    if-lez p2, :cond_8

    .line 94
    .line 95
    iget p2, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_8
    iget p1, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :goto_3
    iget-boolean p2, v6, LQ2/b;->b:Z

    .line 102
    .line 103
    if-nez p2, :cond_9

    .line 104
    .line 105
    iput-boolean v5, v6, LQ2/b;->b:Z

    .line 106
    .line 107
    iget-object p2, v6, LQ2/b;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p2, Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 110
    .line 111
    invoke-virtual {p2, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 112
    .line 113
    .line 114
    :cond_9
    const/high16 p2, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 125
    .line 126
    .line 127
    return-void
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

.method public setAspectRatio(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->c:F

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public setAspectRatioListener(LQ2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->b:LQ2/a;

    .line 2
    .line 3
    return-void
    .line 4
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public setResizeMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->d:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->d:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
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
