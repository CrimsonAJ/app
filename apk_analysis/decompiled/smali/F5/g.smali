.class public LF5/g;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public a:LF5/m;

.field public b:Lu5/a;

.field public c:Landroid/content/res/ColorStateList;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/graphics/PorterDuff$Mode;

.field public g:Landroid/graphics/Rect;

.field public final h:F

.field public i:F

.field public j:F

.field public k:I

.field public l:F

.field public m:F

.field public n:I

.field public o:I

.field public p:I

.field public final q:Landroid/graphics/Paint$Style;


# direct methods
.method public constructor <init>(LF5/g;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, LF5/g;->c:Landroid/content/res/ColorStateList;

    .line 20
    iput-object v0, p0, LF5/g;->d:Landroid/content/res/ColorStateList;

    .line 21
    iput-object v0, p0, LF5/g;->e:Landroid/content/res/ColorStateList;

    .line 22
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, LF5/g;->f:Landroid/graphics/PorterDuff$Mode;

    .line 23
    iput-object v0, p0, LF5/g;->g:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    iput v0, p0, LF5/g;->h:F

    .line 25
    iput v0, p0, LF5/g;->i:F

    const/16 v0, 0xff

    .line 26
    iput v0, p0, LF5/g;->k:I

    const/4 v0, 0x0

    .line 27
    iput v0, p0, LF5/g;->l:F

    .line 28
    iput v0, p0, LF5/g;->m:F

    const/4 v0, 0x0

    .line 29
    iput v0, p0, LF5/g;->n:I

    .line 30
    iput v0, p0, LF5/g;->o:I

    .line 31
    iput v0, p0, LF5/g;->p:I

    .line 32
    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, LF5/g;->q:Landroid/graphics/Paint$Style;

    .line 33
    iget-object v0, p1, LF5/g;->a:LF5/m;

    iput-object v0, p0, LF5/g;->a:LF5/m;

    .line 34
    iget-object v0, p1, LF5/g;->b:Lu5/a;

    iput-object v0, p0, LF5/g;->b:Lu5/a;

    .line 35
    iget v0, p1, LF5/g;->j:F

    iput v0, p0, LF5/g;->j:F

    .line 36
    iget-object v0, p1, LF5/g;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, LF5/g;->c:Landroid/content/res/ColorStateList;

    .line 37
    iget-object v0, p1, LF5/g;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, LF5/g;->d:Landroid/content/res/ColorStateList;

    .line 38
    iget-object v0, p1, LF5/g;->f:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, LF5/g;->f:Landroid/graphics/PorterDuff$Mode;

    .line 39
    iget-object v0, p1, LF5/g;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, LF5/g;->e:Landroid/content/res/ColorStateList;

    .line 40
    iget v0, p1, LF5/g;->k:I

    iput v0, p0, LF5/g;->k:I

    .line 41
    iget v0, p1, LF5/g;->h:F

    iput v0, p0, LF5/g;->h:F

    .line 42
    iget v0, p1, LF5/g;->p:I

    iput v0, p0, LF5/g;->p:I

    .line 43
    iget v0, p1, LF5/g;->n:I

    iput v0, p0, LF5/g;->n:I

    .line 44
    iget v0, p1, LF5/g;->i:F

    iput v0, p0, LF5/g;->i:F

    .line 45
    iget v0, p1, LF5/g;->l:F

    iput v0, p0, LF5/g;->l:F

    .line 46
    iget v0, p1, LF5/g;->m:F

    iput v0, p0, LF5/g;->m:F

    .line 47
    iget v0, p1, LF5/g;->o:I

    iput v0, p0, LF5/g;->o:I

    .line 48
    iget-object v0, p1, LF5/g;->q:Landroid/graphics/Paint$Style;

    iput-object v0, p0, LF5/g;->q:Landroid/graphics/Paint$Style;

    .line 49
    iget-object v0, p1, LF5/g;->g:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    .line 50
    new-instance v0, Landroid/graphics/Rect;

    iget-object p1, p1, LF5/g;->g:Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, LF5/g;->g:Landroid/graphics/Rect;

    :cond_0
    return-void
.end method

.method public constructor <init>(LF5/m;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LF5/g;->c:Landroid/content/res/ColorStateList;

    .line 3
    iput-object v0, p0, LF5/g;->d:Landroid/content/res/ColorStateList;

    .line 4
    iput-object v0, p0, LF5/g;->e:Landroid/content/res/ColorStateList;

    .line 5
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, LF5/g;->f:Landroid/graphics/PorterDuff$Mode;

    .line 6
    iput-object v0, p0, LF5/g;->g:Landroid/graphics/Rect;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    iput v1, p0, LF5/g;->h:F

    .line 8
    iput v1, p0, LF5/g;->i:F

    const/16 v1, 0xff

    .line 9
    iput v1, p0, LF5/g;->k:I

    const/4 v1, 0x0

    .line 10
    iput v1, p0, LF5/g;->l:F

    .line 11
    iput v1, p0, LF5/g;->m:F

    const/4 v1, 0x0

    .line 12
    iput v1, p0, LF5/g;->n:I

    .line 13
    iput v1, p0, LF5/g;->o:I

    .line 14
    iput v1, p0, LF5/g;->p:I

    .line 15
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v1, p0, LF5/g;->q:Landroid/graphics/Paint$Style;

    .line 16
    iput-object p1, p0, LF5/g;->a:LF5/m;

    .line 17
    iput-object v0, p0, LF5/g;->b:Lu5/a;

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, LF5/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LF5/h;-><init>(LF5/g;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, LF5/h;->e:Z

    .line 8
    .line 9
    return-object v0
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
