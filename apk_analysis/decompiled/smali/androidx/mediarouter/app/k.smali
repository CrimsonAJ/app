.class public final Landroidx/mediarouter/app/k;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(IIILandroid/view/View;)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/mediarouter/app/k;->a:I

    iput p1, p0, Landroidx/mediarouter/app/k;->b:I

    iput p2, p0, Landroidx/mediarouter/app/k;->c:I

    iput-object p4, p0, Landroidx/mediarouter/app/k;->d:Landroid/view/View;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;II)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/mediarouter/app/k;->a:I

    .line 2
    iput-object p1, p0, Landroidx/mediarouter/app/k;->d:Landroid/view/View;

    iput p2, p0, Landroidx/mediarouter/app/k;->b:I

    iput p3, p0, Landroidx/mediarouter/app/k;->c:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    .line 1
    iget p2, p0, Landroidx/mediarouter/app/k;->c:I

    .line 2
    .line 3
    iget v0, p0, Landroidx/mediarouter/app/k;->b:I

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/mediarouter/app/k;->d:Landroid/view/View;

    .line 6
    .line 7
    iget v2, p0, Landroidx/mediarouter/app/k;->a:I

    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:LV0/e;

    .line 15
    .line 16
    int-to-float v2, v0

    .line 17
    sub-int/2addr p2, v0

    .line 18
    int-to-float p2, p2

    .line 19
    mul-float/2addr p2, p1

    .line 20
    add-float/2addr p2, v2

    .line 21
    float-to-int p1, p2

    .line 22
    invoke-virtual {v1, p1}, LV0/e;->setAlpha(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    sub-int/2addr v0, p2

    .line 27
    int-to-float v0, v0

    .line 28
    mul-float/2addr v0, p1

    .line 29
    float-to-int p1, v0

    .line 30
    add-int/2addr p2, p1

    .line 31
    sget p1, Landroidx/mediarouter/app/N;->r0:I

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    sub-int p2, v0, p2

    .line 44
    .line 45
    int-to-float p2, p2

    .line 46
    mul-float/2addr p2, p1

    .line 47
    float-to-int p1, p2

    .line 48
    sub-int/2addr v0, p1

    .line 49
    invoke-static {v1, v0}, Landroidx/mediarouter/app/s;->n(Landroid/view/View;I)V

    .line 50
    .line 51
    .line 52
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
