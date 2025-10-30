.class public final LK5/g;
.super LF5/g;
.source "SourceFile"


# instance fields
.field public final r:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(LF5/m;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LF5/g;-><init>(LF5/m;)V

    .line 2
    iput-object p2, p0, LK5/g;->r:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(LK5/g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LF5/g;-><init>(LF5/g;)V

    .line 4
    iget-object p1, p1, LK5/g;->r:Landroid/graphics/RectF;

    iput-object p1, p0, LK5/g;->r:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, LK5/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LF5/h;-><init>(LF5/g;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, LK5/h;->y:LK5/g;

    .line 7
    .line 8
    invoke-virtual {v0}, LF5/h;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
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
