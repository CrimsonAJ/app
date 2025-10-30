.class public interface abstract Lco/notix/interstitial/NotixInterstitial;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/interstitial/NotixInterstitial$Companion;,
        Lco/notix/interstitial/NotixInterstitial$DefaultImpls;
    }
.end annotation


# static fields
.field public static final Companion:Lco/notix/interstitial/NotixInterstitial$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$INSTANCE:Lco/notix/interstitial/NotixInterstitial$Companion;

    sput-object v0, Lco/notix/interstitial/NotixInterstitial;->Companion:Lco/notix/interstitial/NotixInterstitial$Companion;

    return-void
.end method


# virtual methods
.method public abstract createLoader(J)Lco/notix/interstitial/InterstitialLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLco/notix/domain/RequestVars;)Lco/notix/interstitial/InterstitialLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/interstitial/InterstitialLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLjava/lang/Integer;)Lco/notix/interstitial/InterstitialLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract show(Lco/notix/interstitial/InterstitialData;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract show(Lco/notix/interstitial/InterstitialData;LO7/a;LO7/a;LO7/l;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/interstitial/InterstitialData;",
            "LO7/a;",
            "LO7/a;",
            "LO7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract show(Lco/notix/interstitial/InterstitialData;Lco/notix/interstitial/InterstitialButton;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract show(Lco/notix/interstitial/InterstitialData;Lco/notix/interstitial/InterstitialButton;ZLO7/a;LO7/a;LO7/l;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/interstitial/InterstitialData;",
            "Lco/notix/interstitial/InterstitialButton;",
            "Z",
            "LO7/a;",
            "LO7/a;",
            "LO7/l;",
            ")V"
        }
    .end annotation
.end method
